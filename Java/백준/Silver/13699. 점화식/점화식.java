import java.io.*;
import java.util.*;

public class Main {
    static final int UNUSED = -1_000_001;
    static int n;
    static long memo[];

    public static void main(String[] args) throws IOException {
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo = new long[40];
        Arrays.fill(memo, UNUSED);

        System.out.println(dp(n));

    }

    static long dp(int idx) {
        //기저사례
        if (idx == 0) {
            return memo[idx] = 1;
        }

        if (memo[idx] != UNUSED) {
            return memo[idx];
        }

        long temp = 0;

        for (int i = 0; i < idx; i++) {
            temp += dp(i) * dp(idx - i - 1);
        }

        return memo[idx] = temp;
    }

}
