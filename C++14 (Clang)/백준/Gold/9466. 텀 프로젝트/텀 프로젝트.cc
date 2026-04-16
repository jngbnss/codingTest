#include <iostream>
#include <vector>

using namespace std;

int graph[100001];
bool visited[100001];
bool done[100001];
int cnt; // 사이클에 포함된 학생 수

void dfs(int curr) {
    visited[curr] = true;
    int next = graph[curr];

    if (!visited[next]) {
        dfs(next);
    } 
    // 방문은 했지만 탐색이 끝나지 않았다면 사이클 발생
    else if (!done[next]) {
        // 자기 자신을 포함해 사이클을 따라가며 인원 파악
        for (int temp = next; temp != curr; temp = graph[temp]) {
            cnt++;
        }
        cnt++; // 자기 자신 포함
    }

    done[curr] = true; // 현재 노드 탐색 완료
}

void solve() {
    int n;
    cin >> n;

    // 초기화
    cnt = 0;
    for (int i = 1; i <= n; i++) {
        cin >> graph[i];
        visited[i] = false;
        done[i] = false;
    }

    for (int i = 1; i <= n; i++) {
        if (!visited[i]) {
            dfs(i);
        }
    }

    // 전체 학생 수 - 사이클에 포함된 학생 수
    cout << n - cnt << "\n";
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    while (t--) {
        solve();
    }

    return 0;
}