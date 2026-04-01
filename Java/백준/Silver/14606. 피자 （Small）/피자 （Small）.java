import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 100;
    static int n;
    static long memo[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo = new long[INF];
        Arrays.fill(memo, -1);
//        Arrays.fill(memo,INF);
        System.out.println(dp(n));

    }

    static long dp(int n) {
        if (n == 1) {
            return memo[n] = 0;
        }
        if (n == 2) {
            return memo[n] =1;
        }

        if (memo[n] != -1) {
            return memo[n];
        }
        int half = n / 2;
        int last = n - half;
        return memo[n] = dp(half) + dp(last) + (half * last);
    }

}
