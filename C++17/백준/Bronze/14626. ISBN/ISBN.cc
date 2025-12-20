#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    int pos = s.find('*');

    for (int x = 0; x <= 9; x++) {
        int sum = 0;
        for (int i = 0; i < 13; i++) {
            int val;
            if (i == pos) val = x;
            else val = s[i] - '0';

            if (i % 2 == 0) sum += val;
            else sum += 3 * val;
        }

        if (sum % 10 == 0) {
            cout << x << '\n';
            break;
        }
    }
}
