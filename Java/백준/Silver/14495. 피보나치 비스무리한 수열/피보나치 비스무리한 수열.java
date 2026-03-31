import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static int n, m;
    static int arr[];
    static BigInteger dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        long[]dp = new long[1000001];
        // 0 부터 시작이긴하네
//        dp[0] = BigInteger.ZERO;/
        dp[0] =0;
        dp[1] = 1;
        dp[2]=1;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 3] +( dp[i - 1]));
        }
        System.out.println(dp[n]);
    }
}
