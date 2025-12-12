#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b, c;
    while(true) {
        cin >> a >> b >> c;
        if(a==0 && b==0 && c==0) return 0;

        vector<int> v = {a, b, c};
        sort(v.begin(), v.end());

        if(v[0] + v[1] <= v[2]) {
            cout << "Invalid" << '\n';
        } else if(a == b && b == c) {
            cout << "Equilateral" << '\n';
        } else if(a==b || b==c || c==a) {
            cout << "Isosceles" << '\n';
        } else {
            cout << "Scalene" << '\n';
        }
    }
}
