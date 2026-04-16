#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

const int INF = 1e9;
int n;
int w[16][16];
int dp[16][1 << 16];

// curr: 현재 도시, visit: 방문 상태 비트마스크
int tsp(int curr, int visit) {
    // 1. 모든 도시를 방문한 경우
    if (visit == (1 << n) - 1) {
        if (w[curr][0] != 0) return w[curr][0];
        return INF;
    }

    // 2. 이미 계산된 값이 있는 경우 (메모이제이션)
    if (dp[curr][visit] != -1) return dp[curr][visit];

    dp[curr][visit] = INF;

    // 3. 다음 방문할 도시 탐색
    for (int next = 0; next < n; next++) {
        // 경로가 있고, 아직 방문하지 않은 경우
        if (w[curr][next] != 0 && !(visit & (1 << next))) {
            int res = tsp(next, visit | (1 << next));
            if (res != INF) {
                dp[curr][visit] = min(dp[curr][visit], res + w[curr][next]);
            }
        }
    }

    return dp[curr][visit];
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> w[i][j];
        }
    }

    // DP 테이블 -1로 초기화
    for (int i = 0; i < 16; i++) {
        for (int j = 0; j < (1 << 16); j++) {
            dp[i][j] = -1;
        }
    }

    cout << tsp(0, 1) << endl; // 0번 도시 시작, 0번 방문 표시(1)

    return 0;
}