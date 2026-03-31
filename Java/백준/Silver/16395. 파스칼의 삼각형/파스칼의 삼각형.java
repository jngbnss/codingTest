import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static ArrayList<Integer>[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp = new ArrayList[33];
        for (int i = 0; i <= 30; i++) {
            dp[i] = new ArrayList<>();
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        //행 열
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        dp[0].add(1);
        for (int i = 1; i <= 30; i++) {

            dp[i].add(1);

            for (int j = 1; j < i; j++) {
                int next = dp[i - 1].get(j-1) + dp[i - 1].get(j );
                dp[i].add(next);

            }
            dp[i].add(1);
        }
        System.out.println(dp[n - 1].get(k - 1));

    }
}
