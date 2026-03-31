import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static long dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp = new long[100];
        StringTokenizer st = new StringTokenizer(br.readLine());
        long h = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        //dp[1]은 하나밖에 없으니까?
        dp[0] = h;
        dp[1] = (long) (h * 1.05);

        for (int i = 2; i <= 12; i++) {
            if (dp[i - 1] != 0) {
                dp[i] =
                        Math.max(dp[i], (long) (dp[i - 1] * 1.05)); // 기존에 있는 값이랑 비교해야하나?
            }

            if (i >= 3) {
                dp[i] =
                        Math.max(dp[i], (long) (dp[i - 3] * 1.2));
            }

            if (i >= 5) {
                dp[i] =
                        Math.max(dp[i], (long) (dp[i - 5] * 1.35));
            }
        }
        System.out.println(dp[y]);
    }
}
