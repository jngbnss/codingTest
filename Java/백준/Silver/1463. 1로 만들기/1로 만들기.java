import java.io.*;
import java.util.*;

public class Main {
    static final int UNUSED = 1_000_001;
    static int n;
    static int memo[];

    public static void main(String[] args) throws IOException {
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        memo = new int[1000004];
        Arrays.fill(memo, UNUSED);

        System.out.println(dp(n));

    }

    static int dp(int idx) {
//        기저사례
        if (idx == 1) {
            return memo[idx] = 0;
        }

        if (memo[idx] != UNUSED) {
            return memo[idx];
        }

        if (idx % 3 == 0) {
            memo[idx] = Math.min(memo[idx], dp(idx / 3) + 1);
        }
        if (idx % 2 == 0) {
            memo[idx] = Math.min(memo[idx], dp(idx / 2) + 1);
        }
        memo[idx] = Math.min(memo[idx], dp(idx - 1) + 1);

        return memo[idx];
    }

}
