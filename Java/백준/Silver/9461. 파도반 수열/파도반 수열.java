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
        t = Integer.parseInt(br.readLine());

        memo = new long[104];
        arr = new int[104];
        Arrays.fill(memo, UNUSED);

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            System.out.println(dp(n));
        }
    }

    static long dp(int idx) {
        //기저사례
        if (idx == 0) {
            return memo[idx] = 0;
        }
        if (idx <= 3 && idx > 0) {
            return memo[idx] = 1;
        }

        if (memo[idx] != UNUSED) {
            return memo[idx];
        }

        return memo[idx] = dp(idx - 3) + dp(idx - 2);
    }

}
