import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static long dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        //초
        dp = new long[100];
        for (int i = 0; i < 100; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        //기
        dp[0] = 0;
        dp[1] = 1;

        //메
        go(n);
        System.out.println(dp[n]+" "+(n-2));

        //로

    }

    static long go(int n) {
        if (dp[n] != Integer.MAX_VALUE) {
            return dp[n];
        }

        dp[n] = go(n - 1) + go(n - 2);
        return dp[n];
    }

}
