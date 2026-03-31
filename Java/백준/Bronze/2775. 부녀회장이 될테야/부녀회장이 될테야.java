import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static long dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        dp = new long[20][20];
        for (int i = 0; i < 16; i++) {
            dp[0][i] = i; //0층 1호 는 1명이 삽니다.
//            dp[i][0] = 0;
        }
        for (int i = 0; i < t; i++) {
            //k층 n호
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            long ret = go(k, n);
            System.out.println(ret);
        }

    }

    static long go(int k, int n) {
        //기저사례
        if (k == 0) {
            return n;
        }
        if (n == 0) {
            return 0;
        }

        //메모이제이션
        if (dp[k][n] != 0) {
            return dp[k][n];
        }

        //로직
        return dp[k][n] = go(k - 1, n) + go(k, n - 1);

    }

}
