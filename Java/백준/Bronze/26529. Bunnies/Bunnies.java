import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static long dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());

        dp = new long[50];

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            go(k);
            System.out.println(dp[k]);
        }
    }

    static long go(int k) {
        if (k == 0) {
            dp[k] = 1;
            return 1;
        }

        if (k == 1) {
            dp[k] = 1;
            return 1;
        }
        if (dp[k] != 0) {
            return dp[k];
        }
        return dp[k] = go(k - 1) + go(k - 2);

    }

}
