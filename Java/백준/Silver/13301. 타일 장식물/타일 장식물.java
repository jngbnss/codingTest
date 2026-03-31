import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static long dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new long[85];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n + 2; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n + 1] * 2);
    }
}
