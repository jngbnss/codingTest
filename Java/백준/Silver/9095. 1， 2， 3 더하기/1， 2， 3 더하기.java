import java.io.*;
import java.util.*;

public class Main {
    static int n, t;

    static long memo[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());

        memo = new long[1000004];
        Arrays.fill(memo, 100000);

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp(n));
        }
    }

    static long dp(int idx) {
        if (idx == 1) {
            return memo[idx] = 1;
        }

        if (idx == 2) {
            return memo[idx] = 2;
        }
        if (idx == 3) {
            return memo[idx] = 4;
        }

        if (memo[idx] != 100000) {
            return memo[idx];
        }

        return memo[idx] = dp(idx - 1) + dp(idx - 2) + dp(idx - 3);
    }
}
