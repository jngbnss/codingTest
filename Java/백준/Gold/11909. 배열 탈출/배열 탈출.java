import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] map = new int[n + 1][n + 1];
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 && j == 1) continue;

                int fromTop = Integer.MAX_VALUE;
                int fromLeft = Integer.MAX_VALUE;

                // 1. 위에서 아래로 내려오는 경우
                if (i > 1) {
                    int cost = 0;
                    if (map[i][j] >= map[i-1][j]) {
                        cost = map[i][j] - map[i-1][j] + 1;
                    }
                    fromTop = dp[i-1][j] + cost;
                }

                // 2. 왼쪽에서 오른쪽으로 오는 경우
                if (j > 1) {
                    int cost = 0;
                    if (map[i][j] >= map[i][j-1]) {
                        cost = map[i][j] - map[i][j-1] + 1;
                    }
                    fromLeft = dp[i][j-1] + cost;
                }

                dp[i][j] = Math.min(fromTop, fromLeft);
            }
        }

        System.out.println(dp[n][n]);
    }
}