import java.io.*;
import java.util.*;

public class Main {
    static final int UNUSED = -1_000_001;
    static int n;
    static int memo[];

    public static void main(String[] args) throws IOException {
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());

        memo = new int[12];
        Arrays.fill(memo, UNUSED);
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            System.out.println(dp(x));
        }

    }

    static int dp(int idx) {
        //기저사례
        if (idx == 1) {
            return memo[idx] = 1;
        }

        if (idx == 2) {
            return memo[idx] = 2;
        }

        if (idx == 3) {
            return memo[idx] = 4;
        }

        if (memo[idx] != UNUSED) {
            return memo[idx];
        }

        return memo[idx] = dp(idx - 1) + dp(idx - 2) + dp(idx - 3);
    }

}
