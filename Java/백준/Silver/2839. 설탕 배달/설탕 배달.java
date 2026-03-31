import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static long dp[];
    static final int MX = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        dp = new long[5004];
        Arrays.fill(dp, MX);

        dp[3] = 1;
        dp[5] = 1;

        go(n);
        if (dp[n] >= MX) {
            System.out.println(-1);
        } else {
            System.out.println(dp[n]);
        }

    }

    static long go(int n) {
        if (n < 3) {
            return MX;
        }
        if (n == 3 || n == 5) {
            return 1;
        }

        if (dp[n] != MX) {
            return dp[n];
        }

        return dp[n] = Math.min(go(n - 3), go(n - 5)) + 1;
    }


}
