import java.io.*;
import java.util.*;

public class Main {
    static int n, t;
    static long cnt0[], cnt1[];
    static long memo[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        memo = new long[1000004];
        Arrays.fill(memo, -1);
        cnt0 = new long[50];
        cnt1 = new long[50];
        cnt0[0] = 1;
        cnt0[1] = 0;
        cnt1[0] = 0;
        cnt1[1] = 1;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= n; j++) {
                cnt0[j] = cnt0[j - 1] + cnt0[j - 2];
                cnt1[j] = cnt1[j - 1] + cnt1[j - 2];
            }
            System.out.println(cnt0[n] + " " + cnt1[n]);
        }
    }


//    }
//
//    static long dp(int idx) {
//
//        if (idx == 0) {
//            cnt0++;
//            return memo[idx] = 0;
//
//        }
//        if (idx == 1) {
//            cnt1++;
//            return memo[idx] = 1;
//
//        }
//
//        if (memo[idx] != -1) {
//            if (idx == 0) {
//                cnt0++;
//            }
//            if (idx == 1) {
//                cnt1++;
//            }
//            return memo[idx];
//        }
//
//        return memo[idx] = dp(idx - 1) + dp(idx - 2);
//    }
}
