#include <iostream>
#include <vector>

using namespace std;

typedef long long ll;
const ll MOD = 1000000007;

// 8x8 행렬 곱셈 함수
vector<vector<ll>> multiply(const vector<vector<ll>>& A, const vector<vector<ll>>& B) {
    vector<vector<ll>> res(8, vector<ll>(8, 0));
    for (int i = 0; i < 8; i++) {
        for (int k = 0; k < 8; k++) {
            if (A[i][k] == 0) continue;
            for (int j = 0; j < 8; j++) {
                res[i][j] = (res[i][j] + A[i][k] * B[k][j]) % MOD;
            }
        }
    }
    return res;
}

// 행렬 거듭제곱 (분할 정복)
vector<vector<ll>> power(vector<vector<ll>> A, int d) {
    vector<vector<ll>> res(8, vector<ll>(8, 0));
    for (int i = 0; i < 8; i++) res[i][i] = 1; // 단위 행렬

    while (d > 0) {
        if (d % 2 == 1) res = multiply(res, A);
        A = multiply(A, A);
        d /= 2;
    }
    return res;
}

int main() {
    int D;
    cin >> D;

    // 정보과학관(0), 전산관(1), 미래관(2), 신양관(3), 한경직(4), 형남공학관(5), 학생회관(6), 진리관(7)
    // 인접 리스트 정보를 바탕으로 행렬 구성
    vector<vector<ll>> adj = {
        {0, 1, 1, 0, 0, 0, 0, 0},
        {1, 0, 1, 1, 0, 0, 0, 0},
        {1, 1, 0, 1, 1, 0, 0, 0},
        {0, 1, 1, 0, 1, 1, 0, 0},
        {0, 0, 1, 1, 0, 1, 1, 0},
        {0, 0, 0, 1, 1, 0, 0, 1},
        {0, 0, 0, 0, 1, 0, 0, 1},
        {0, 0, 0, 0, 0, 1, 1, 0}
    };

    vector<vector<ll>> result = power(adj, D);
    cout << result[0][0] << endl;

    return 0;
}