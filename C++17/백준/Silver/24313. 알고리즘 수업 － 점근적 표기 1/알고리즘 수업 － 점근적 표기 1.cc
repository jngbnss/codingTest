#include <bits/stdc++.h>
using namespace std;

int main() {
    long long a1, a0, c, n0;
    cin >> a1 >> a0 >> c >> n0;

    if(a1 > c) {
        // n이 커질수록 좌변이 커져 조건 불가
        cout << 0;
    } 
    else if(a1 == c) {
        // (a1-c)*n + a0 = a0 <= 0 이어야 함
        if(a0 <= 0) cout << 1;
        else cout << 0;
    }
    else { // a1 < c
        // n이 커질수록 좌변 감소 → n0에서 성립하면 모두 성립
        if(a1 * n0 + a0 <= c * n0) cout << 1;
        else cout << 0;
    }
}
