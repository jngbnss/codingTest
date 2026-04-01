import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 1100;
    static int n, t;
    static int memo[];
    static int arr[];

    public static void main(String[] args) throws IOException {
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr = new int[INF];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            memo = new int[INF];
            Arrays.fill(memo, INF);
            int ret = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                ret = Math.max(ret, dp(j));
            }
            System.out.println(ret);
        }
    }

    static int dp(int idx) {
        //기저사례
        if (idx == n - 1) {
            return memo[idx] = arr[idx];
        }

        if (memo[idx] != INF) {
            return memo[idx];
        }

        return memo[idx] = Math.max(arr[idx], arr[idx] + dp(idx + 1));
    }

}
