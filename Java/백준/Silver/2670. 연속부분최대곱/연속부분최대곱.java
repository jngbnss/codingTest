import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 10004;
    static int n;
    static double memo[];
    static double arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo = new double[INF];
        arr = new double[INF];

        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        Arrays.fill(memo, -1);
//        Arrays.fill(memo,INF);

        double ret = 0;
        for (int i = 0; i < n; i++) {
            ret = Math.max(dp(i), ret);
        }

        System.out.printf("%.3f", ret);
    }

    static double dp(int idx) {
        //기저사례
        if (idx == n - 1) {
            return memo[idx] = arr[idx];
        }

        if (memo[idx] != -1) {
            return memo[idx];
        }

        return memo[idx] = Math.max(arr[idx], arr[idx] * dp(idx + 1));
    }

}
