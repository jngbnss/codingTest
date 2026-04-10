import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 속도를 위해 BufferedReader와 StringTokenizer 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean[][] dp = new boolean[N + 1][N + 1];

        // 1. 길이가 1인 경우
        for (int i = 1; i <= N; i++) {
            dp[i][i] = true;
        }

        // 2. 길이가 2인 경우
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i + 1]) dp[i][i + 1] = true;
        }

        // 3. 길이가 3 이상인 경우 (길이 len을 늘려가며 확인)
        for (int len = 3; len <= N; len++) {
            for (int i = 1; i <= N - len + 1; i++) {
                int j = i + len - 1;
                if (arr[i] == arr[j] && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                }
            }
        }

        // 질문 처리
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            
            if (dp[s][e]) sb.append("1\n");
            else sb.append("0\n");
        }

        System.out.print(sb);
    }
}