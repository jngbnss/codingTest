import java.util.*;
import java.io.*;

public class Main {
    static int[][] board = new int[9][9];
    static List<int[]> zeros = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            String line = br.readLine();
            for (int j = 0; j < 9; j++) {
                board[i][j] = line.charAt(j) - '0';
                if (board[i][j] == 0) {
                    zeros.add(new int[]{i, j});
                }
            }
        }

        solve(0);
    }

    static void solve(int idx) {
        // 모든 빈칸을 다 채웠다면 결과 출력 후 종료
        if (idx == zeros.size()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(board[i][j]);
                }
                sb.append("\n");
            }
            System.out.print(sb);
            System.exit(0); 
        }

        int[] pos = zeros.get(idx);
        int r = pos[0];
        int c = pos[1];

        // 1부터 9까지 시도 (사전순)
        for (int n = 1; n <= 9; n++) {
            if (isValid(r, c, n)) {
                board[r][c] = n;
                solve(idx + 1); // 다음 빈칸으로
                board[r][c] = 0; // 백트래킹 (원상복구)
            }
        }
    }

    static boolean isValid(int r, int c, int n) {
        for (int i = 0; i < 9; i++) {
            // 행 검사
            if (board[r][i] == n) return false;
            // 열 검사
            if (board[i][c] == n) return false;
        }

        // 3x3 사각형 검사
        int startR = (r / 3) * 3;
        int startC = (c / 3) * 3;
        for (int i = startR; i < startR + 3; i++) {
            for (int j = startC; j < startC + 3; j++) {
                if (board[i][j] == n) return false;
            }
        }

        return true;
    }
}