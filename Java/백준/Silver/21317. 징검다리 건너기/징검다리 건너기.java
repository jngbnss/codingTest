import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 100000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(0);
            return;
        }

        int[][] cost = new int[n][2];
        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken()); //작은 점프
            cost[i][1] = Integer.parseInt(st.nextToken()); // 큰 점프
        }

        int k = Integer.parseInt(br.readLine());

        // dp[돌 번호][k 점프 사용 여부 0,1]
        int[][] dp = new int[n + 1][2];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
        }

        //시작점 초기화
        dp[1][0] = 0;

        for (int i = 1; i < n; i++) {
            // 아직 k 점프를 안 쓴 경우에서 파생
            if (dp[i][0] != INF) {
                //작은 점프 1칸
                if (i + 1 <= n) {
                    dp[i + 1][0] = Math.min(dp[i + 1][0], dp[i][0] + cost[i][0]);

                }
                if (i + 2 <= n) {
                    dp[i + 2][0] = Math.min(dp[i + 2][0], dp[i][0] + cost[i][1]);
                }
                //매우 큰 점프(3칸) -> 사용 후 상태 1로 전이
                if (i + 3 <= n) {
                    dp[i + 3][1] = Math.min(dp[i + 3][1], dp[i][0] + k);
                }
            }

            // 2. 이미 k 점프를 쓴 경우에서 파생
            if (dp[i][1] != INF) { // 엥?
                //작은 점프
                if (i + 1 <= n) {
                    dp[i + 1][1] = Math.min(dp[i + 1][1], dp[i][1] + cost[i][0]);

                }
                if (i + 2 <= n) {
                    dp[i + 2][1] = Math.min(dp[i + 2][1], dp[i][1] + cost[i][1]);
                }
            }
        }

        System.out.println(Math.min(dp[n][0], dp[n][1]));

    }
}
