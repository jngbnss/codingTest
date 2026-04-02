import java.io.*;
import java.util.*;

public class Main {
    static final int UNUSED = -1;
    static int n;
    static long memo[];
    static int arr[];

    public static void main(String[] args) throws IOException {
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo = new long[1000004];
        arr = new int[1000004];
        Arrays.fill(memo, UNUSED);

        System.out.println(dp(n));

    }

    static long dp(int idx) {
        //기저사례
        if (idx == 0) {
            return 1;
        }
        if (idx == 1) {
            return 1;
        }

        if (memo[idx] != UNUSED) {
            return memo[idx];
        }

        return memo[idx] = (dp(idx - 1) + dp(idx - 2)) % 15746;
    }

}
