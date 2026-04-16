#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    // 행렬의 크기 저장 (n개의 행렬이면 n+1개의 숫자로 표현 가능)
    // i번째 행렬의 크기는 matrix[i] x matrix[i+1]
    vector<pair<int, int>> matrix(n);
    for (int i = 0; i < n; i++) {
        cin >> matrix[i].first >> matrix[i].second;
    }

    // dp[i][j] : i번째 행렬부터 j번째 행렬까지 곱하는 최소 비용
    vector<vector<int>> dp(n, vector<int>(n, 0));

    // len은 곱할 행렬의 구간 길이 (1이면 행렬 2개를 곱하는 것)
    for (int len = 1; len < n; len++) {
        for (int i = 0; i + len < n; i++) {
            int j = i + len;
            dp[i][j] = INT_MAX;

            // i와 j 사이의 분할 지점 k를 바꿔가며 최솟값 탐색
            for (int k = i; k < j; k++) {
                int cost = dp[i][k] + dp[k+1][j] + 
                           (matrix[i].first * matrix[k].second * matrix[j].second);
                dp[i][j] = min(dp[i][j], cost);
            }
        }
    }

    cout << dp[0][n - 1] << "\n";

    return 0;
}