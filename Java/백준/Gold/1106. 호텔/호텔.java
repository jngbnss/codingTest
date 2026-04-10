import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken()); // 목표 고객 수
        int N = Integer.parseInt(st.nextToken()); // 도시의 개수

        // 목표 고객 수 C에 최대 유입 가능 고객 수(100)를 더해 여유 있게 크기 설정
        int[] dp = new int[C + 101];
        Arrays.fill(dp, 100000000); // 충분히 큰 값으로 초기화 (INF)
        dp[0] = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int customer = Integer.parseInt(st.nextToken());

            // 각 도시의 정보를 이용해 dp 테이블 갱신
            for (int j = customer; j < C + 101; j++) {
                if (dp[j - customer] != 100000000) {
                    dp[j] = Math.min(dp[j], dp[j - customer] + cost);
                }
            }
        }

        // C명 "이상" 이므로, C부터 마지막 인덱스까지 중 최솟값을 찾음
        int result = Integer.MAX_VALUE;
        for (int i = C; i < C + 101; i++) {
            result = Math.min(result, dp[i]);
        }

        System.out.println(result);
    }
}