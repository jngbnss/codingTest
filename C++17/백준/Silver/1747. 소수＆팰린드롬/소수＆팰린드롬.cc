#include <bits/stdc++.h>
using namespace std;

bool is_palindrome(int n) {
    string s = to_string(n);
    string t = s;
    reverse(t.begin(), t.end());
    return s == t;
}

bool is_prime(int n) {
    if(n < 2) return false;
    for(int i = 2; i*i <= n; i++) {
        if(n % i == 0) return false;
    }
    return true;
}

int main() {
    int N;
    cin >> N;
    
    for(int i = N;; i++) {
        if(is_palindrome(i) && is_prime(i)) {
            cout << i << "\n";
            break;
        }
    }
}
