#include <iostream>
#include <vector>
#include <string>
#include <queue>
#include <cstring>

using namespace std;

int H, W;
char map[102][102];
bool visited[102][102];
bool hasKey[26];
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

int solve() {
    memset(visited, false, sizeof(visited));
    memset(hasKey, false, sizeof(hasKey));
    vector<queue<pair<int, int>>> door_wait(26);
    int document_count = 0;

    cin >> H >> W;
    for (int i = 1; i <= H; i++) {
        for (int j = 1; j <= W; j++) {
            cin >> map[i][j];
        }
    }

    string initial_keys;
    cin >> initial_keys;
    if (initial_keys != "0") {
        for (char k : initial_keys) hasKey[k - 'a'] = true;
    }

    // 맵 외곽을 빈 공간('.')으로 감싸서 진입을 편하게 함
    for (int i = 0; i <= H + 1; i++) {
        map[i][0] = map[i][W + 1] = '.';
    }
    for (int j = 0; j <= W + 1; j++) {
        map[0][j] = map[H + 1][j] = '.';
    }

    queue<pair<int, int>> q;
    q.push({0, 0});
    visited[0][0] = true;

    while (!q.empty()) {
        int r = q.front().first;
        int c = q.front().second;
        q.pop();

        for (int i = 0; i < 4; i++) {
            int nr = r + dx[i];
            int nc = c + dy[i];

            if (nr < 0 || nr > H + 1 || nc < 0 || nc > W + 1) continue;
            if (visited[nr][nc] || map[nr][nc] == '*') continue;

            char cur = map[nr][nc];
            visited[nr][nc] = true;

            if (cur >= 'A' && cur <= 'Z') { // 문을 만났을 때
                int key_idx = cur - 'A';
                if (hasKey[key_idx]) {
                    q.push({nr, nc});
                } else {
                    door_wait[key_idx].push({nr, nc});
                }
            } else if (cur >= 'a' && cur <= 'z') { // 열쇠를 만났을 때
                int key_idx = cur - 'a';
                hasKey[key_idx] = true;
                q.push({nr, nc});
                // 이 열쇠로 열 수 있는 대기 중인 문들을 큐에 추가
                while (!door_wait[key_idx].empty()) {
                    q.push(door_wait[key_idx].front());
                    door_wait[key_idx].pop();
                }
            } else if (cur == '$') { // 문서를 만났을 때
                document_count++;
                q.push({nr, nc});
            } else { // 빈 공간('.')
                q.push({nr, nc});
            }
        }
    }
    return document_count;
}

int main() {
    int T;
    cin >> T;
    while (T--) {
        cout << solve() << "\n";
    }
    return 0;
}