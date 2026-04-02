import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dp = new int[k + 1];
        
        // n에서 시작해서 k까지 올라갑니다.
        for (int i = n + 1; i <= k; i++) {
            // 1. 기본적으로 이전 단계(i-1)에서 1을 더해 오는 경우
            dp[i] = dp[i - 1] + 1;
            
            // 2. 2를 곱해서 올 수 있는 경우 (i가 2로 나누어 떨어지고, i/2가 n 이상일 때)
            if (i % 2 == 0 && i / 2 >= n) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }

        System.out.println(dp[k]);
    }
}