#include<bits/stdc++.h>
using namespace std;
long long n,ret=1,b,c,a,cnt;
string s;
int main() {
    string line;
    getline(cin, line); // 한 줄 입력

    int count = 0;
    bool inWord = false; // 단어 안에 있는지 여부

    for (char c : line) {
        if (c != ' ') {
            if (!inWord) { // 새 단어 시작
                count++;
                inWord = true;
            }
        } else {
            inWord = false; // 공백이면 단어 끝
        }
    }

    cout << count << endl;
    return 0;
}