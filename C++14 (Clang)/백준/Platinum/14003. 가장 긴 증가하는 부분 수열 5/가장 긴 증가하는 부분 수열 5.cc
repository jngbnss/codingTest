#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    vector<int> a(n);
    for (int i = 0; i < n; i++) cin >> a[i];

    vector<int> lis;        // LIS의 형태를 유지 (길이 계산용)
    vector<int> indexOrder(n); // 각 원소가 lis의 몇 번째 인덱스에 들어갔는지 기록

    for (int i = 0; i < n; i++) {
        if (lis.empty() || lis.back() < a[i]) {
            indexOrder[i] = lis.size();
            lis.push_back(a[i]);
        } else {
            // 이분 탐색으로 교체 위치 찾기
            auto it = lower_bound(lis.begin(), lis.end(), a[i]);
            *it = a[i];
            indexOrder[i] = distance(lis.begin(), it);
        }
    }

    // 1. LIS 길이 출력
    int len = lis.size();
    cout << len << "\n";

    // 2. 역추적을 통한 수열 복원
    stack<int> s;
    int target = len - 1;
    for (int i = n - 1; i >= 0; i--) {
        if (indexOrder[i] == target) {
            s.push(a[i]);
            target--;
        }
    }

    // 3. 실제 수열 출력
    while (!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }

    return 0;
}