#include <iostream>
#include <vector>
#include <algorithm> // next_permutation 포함

using namespace std;

int main() {
    // 입출력 속도 향상
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int N;
    cin >> N;

    vector<int> v(N);
    for (int i = 0; i < N; i++) {
        v[i] = i + 1; // 1부터 N까지 채우기
    }

    // next_permutation은 사전 순으로 다음 순열을 생성하며, 
    // 마지막 순열에 도달하면 false를 반환합니다.
    do {
        for (int i = 0; i < N; i++) {
            cout << v[i] << " ";
        }
        cout << "\n";
    } while (next_permutation(v.begin(), v.end()));

    return 0;
}