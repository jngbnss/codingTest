#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int N;
int max_block = 0;

// 한 방향으로 블록을 미는 함수 (왼쪽 기준)
vector<vector<int>> move_board(vector<vector<int>> board) {
    vector<vector<int>> next_board(N, vector<int>(N, 0));

    for (int i = 0; i < N; i++) {
        int idx = 0;
        int last_val = 0;
        for (int j = 0; j < N; j++) {
            if (board[i][j] == 0) continue;

            if (last_val == board[i][j]) {
                // 직전 블록과 값이 같으면 합침
                next_board[i][idx - 1] = last_val * 2;
                last_val = 0; // 한 번 합쳐진 블록은 다시 합쳐지지 않음
            } else {
                // 값이 다르거나 비어있으면 새로 배치
                next_board[i][idx++] = board[i][j];
                last_val = board[i][j];
            }
        }
    }
    return next_board;
}

// 보드를 90도 회전시키는 함수
vector<vector<int>> rotate(vector<vector<int>> board) {
    vector<vector<int>> next_board(N, vector<int>(N, 0));
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            next_board[j][N - 1 - i] = board[i][j];
        }
    }
    return next_board;
}

void dfs(vector<vector<int>> board, int depth) {
    // 현재 보드에서 최대값 갱신
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            max_block = max(max_block, board[i][j]);
        }
    }

    if (depth == 5) return;

    // 4방향 탐색
    for (int dir = 0; dir < 4; dir++) {
        dfs(move_board(board), depth + 1);
        board = rotate(board); // 다음 방향을 위해 회전
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N;
    vector<vector<int>> board(N, vector<int>(N));
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> board[i][j];
        }
    }

    dfs(board, 0);
    cout << max_block << endl;

    return 0;
}