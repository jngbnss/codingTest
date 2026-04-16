#include <iostream>
#include <vector>

using namespace std;

const int MOD = 1000000000;
int dp[101][10][1024];

int main() {
    int n;
    cin >> n;

    // 초기값: 길이가 1일 때 (0으로 시작 불가)
    for (int i = 1; i <= 9; i++) {
        dp[1][i][1 << i] = 1;
    }

    // DP 진행
    for (int len = 1; len < n; len++) {
        for (int last = 0; last <= 9; last++) {
            for (int visit = 0; visit < 1024; visit++) {
                if (dp[len][last][visit] == 0) continue;

                // 1. 다음 숫자가 last - 1 인 경우
                if (last > 0) {
                    int next_visit = visit | (1 << (last - 1));
                    dp[len + 1][last - 1][next_visit] = (dp[len + 1][last - 1][next_visit] + dp[len][last][visit]) % MOD;
                }

                // 2. 다음 숫자가 last + 1 인 경우
                if (last < 9) {
                    int next_visit = visit | (1 << (last + 1));
                    dp[len + 1][last + 1][next_visit] = (dp[len + 1][last + 1][next_visit] + dp[len][last][visit]) % MOD;
                }
            }
        }
    }

    // 결과 구하기: 길이가 N이고 모든 숫자(1023)를 사용한 경우의 합
    long long ans = 0;
    for (int i = 0; i <= 9; i++) {
        ans = (ans + dp[n][i][1023]) % MOD;
    }

    cout << ans << endl;

    return 0;
}