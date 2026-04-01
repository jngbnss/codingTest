import java.io.*;
import java.util.*;

public class Main {


    static final int INF = 100004;
    static int n;
    static long memo[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo = new long[INF];
        Arrays.fill(memo, -1);
//        Arrays.fill(memo, INF);

        long ret = dp(n);
        System.out.println(ret);
    }

    static long dp(int n) {
        //기저사례
        if (n == 0) {
            memo[n] = 0;
        }
        if (n <= 2) {
            memo[n] = 2;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        if (n / 2 == 0) {
            int temp = n / 2;

            return memo[n] = (dp(n - 2) * 2) % 16769023;
        } else {
            int temp = (n + 1 / 2);
            return memo[n] = (dp(n - 2) * 2) % 16769023;
        }


    }

}
