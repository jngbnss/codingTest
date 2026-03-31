import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static long dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new long[50001];
        Arrays.fill(dp, 9999);
        dp[3] = 1;
        dp[5] = 1;

        for (int i = 6; i <= n; i++) {
            if (dp[i - 3] < 9999 || dp[i - 5] < 9999) {
                dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
            }
        }
        if (dp[n] >= 9999) {
            System.out.println(-1);
        } else {
            System.out.println(dp[n]);
        }
    }
}
