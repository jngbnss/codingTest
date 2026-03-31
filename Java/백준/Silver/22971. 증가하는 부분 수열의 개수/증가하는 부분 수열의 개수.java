import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static long arr[], dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new long[n];
        dp = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.fill(dp, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {

                    dp[i] = (dp[i] + dp[j]) % 998244353;

                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}
