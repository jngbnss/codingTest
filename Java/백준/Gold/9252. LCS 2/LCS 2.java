import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s1 = br.readLine().toCharArray();
        char[] s2 = br.readLine().toCharArray();

        int n = s1.length;
        int m = s2.length;
        int[][] dp = new int[n + 1][m + 1];

        // 1. DP 테이블 채우기 (길이 구하기)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1[i - 1] == s2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // 2. LCS 길이 출력
        int length = dp[n][m];
        System.out.println(length);

        if (length == 0) return;

        // 3. 역추적을 통한 문자열 찾기
        StringBuilder sb = new StringBuilder();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (dp[i][j] == dp[i - 1][j]) {
                i--;
            } else if (dp[i][j] == dp[i][j - 1]) {
                j--;
            } else {
                sb.append(s1[i - 1]);
                i--;
                j--;
            }
        }

        // 역순으로 저장되었으므로 뒤집어서 출력
        System.out.println(sb.reverse().toString());
    }
}