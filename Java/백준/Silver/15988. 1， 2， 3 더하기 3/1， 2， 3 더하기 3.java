import java.io.*;
import java.util.*;

public class Main {
    static final int UNUSED = -1_000_001;
    static int n, t;
    static long memo[];
    static int arr[];

    public static void main(String[] args) throws IOException {
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        memo = new long[1000004];

        Arrays.fill(memo, UNUSED);

        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            System.out.println(dp(n));
        }

    }

    static long dp(int idx) {
        //기저사례
        if (idx == 1) {
            return 1;
        }
        if (idx == 2) {
            return 2;
        }
        if (idx == 3) {
            return 4;
        }
        if (idx == 4) {
            return memo[idx] = 7;
        }

        if (memo[idx] != UNUSED) {
            return memo[idx];
        }

        return memo[idx] = (dp(idx - 1) + dp(idx - 2) + dp(idx - 3)) % 1000000009;
    }

}
