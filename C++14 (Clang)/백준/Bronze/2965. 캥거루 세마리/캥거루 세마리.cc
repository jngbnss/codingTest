#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;

    vector<int> v = {a, b, c};
    sort(v.begin(), v.end());

    // 두 간격 중 더 큰 쪽을 선택
    int gap1 = v[1] - v[0] - 1;
    int gap2 = v[2] - v[1] - 1;

    if (gap1 > gap2) {
        cout << gap1;
    } else {
        cout << gap2;
    }

    return 0;
}