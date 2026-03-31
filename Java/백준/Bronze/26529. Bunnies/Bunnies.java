import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static int n, m;
    static int arr[];
    static long dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());


        dp = new long[10001];
        // 0 부터 시작이긴하네
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= 90; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]);
        }
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            System.out.println(dp[x]);
        }
//        System.out.println(dp[n]+" "+(n-2));
    }
}
