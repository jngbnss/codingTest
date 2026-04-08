import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static int arr[][];
    static int memo[][];

    static int dp(int idx, int flag) {
        if (idx == n) {
            return 0;
        }
        if (idx > n) {
            return 987654312;
        }
        if (memo[idx][flag] != -1) {
            return memo[idx][flag];
        }
        int temp = dp(idx + 1, flag) + arr[idx][1];
        if (idx + 2 <= n) {
            temp = Math.min(temp, dp(idx + 2, flag) + arr[idx][2]);
        }
        if (idx + 3 <= n && flag == 0) {
            temp = Math.min(temp, dp(idx + 3, 1) + k);
        }
        return memo[idx][flag] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][3];
        memo = new int[n + 1][2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }
        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        k = Integer.parseInt(br.readLine());
        System.out.println(dp(1, 0));
    }
}
