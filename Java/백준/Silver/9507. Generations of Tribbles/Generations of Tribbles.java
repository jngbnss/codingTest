import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 100;
    static int n;
    static long memo[];

    public static void main(String[] args) throws IOException {
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo = new long[INF];

        Arrays.fill(memo, -1);
//        Arrays.fill(memo,INF);
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            System.out.println(dp(x));
        }

    }

    static long dp(int idx) {
        //기저사례
        if (idx < 2) {
            return memo[idx] = 1;
        }
        if (idx == 2) {
            return memo[idx] = 2;
        }
        if (idx == 3) {
            return memo[idx] = 4;
        }

        if (memo[idx] != -1) {
            return memo[idx];
        }

        return memo[idx] = dp(idx - 1) + dp(idx - 2) + dp(idx - 3) + dp(idx - 4);
    }

}
