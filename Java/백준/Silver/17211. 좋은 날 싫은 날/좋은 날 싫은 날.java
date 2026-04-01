import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int startMood = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double p00 = Double.parseDouble(st.nextToken()); // 좋음 -> 좋음
        double p01 = Double.parseDouble(st.nextToken()); // 좋음 -> 나쁨
        double p10 = Double.parseDouble(st.nextToken()); // 나쁨 -> 좋음
        double p11 = Double.parseDouble(st.nextToken()); // 나쁨 -> 나쁨

        // dp[day][0]: day일 뒤에 기분이 좋을 확률
        // dp[day][1]: day일 뒤에 기분이 나쁠 확률
        double[][] dp = new double[N + 1][2];

        // 1. 초기 상태 설정 (0일차)
        if (startMood == 0) {
            dp[0][0] = 1.0; // 오늘 좋음
            dp[0][1] = 0.0;
        } else {
            dp[0][0] = 0.0;
            dp[0][1] = 1.0; // 오늘 나쁨
        }

        // 2. 반복문을 통해 차례대로 확률 계산
        for (int i = 1; i <= N; i++) {
            // i일째에 기분이 좋을 확률 = 
            // (i-1일째 좋았음 * 좋을->좋을) + (i-1일째 나빴음 * 나쁠->좋을)
            dp[i][0] = dp[i - 1][0] * p00 + dp[i - 1][1] * p10;

            // i일째에 기분이 나쁠 확률 = 
            // (i-1일째 좋았음 * 좋을->나쁨) + (i-1일째 나빴음 * 나쁠->나쁨)
            dp[i][1] = dp[i - 1][0] * p01 + dp[i - 1][1] * p11;
        }

        // 3. N일차 결과 출력 (1000 곱하고 반올림)
        System.out.println(Math.round(dp[N][0] * 1000));
        System.out.println(Math.round(dp[N][1] * 1000));
    }
}