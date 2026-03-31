import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n은 입력 줄의 개수입니다.
        String firstLine = br.readLine();
        if (firstLine == null) return;
        int n = Integer.parseInt(firstLine.trim());

        // k의 최대 범위가 2^15이므로 약 33,000 정도면 충분합니다.
        BigInteger[] dp = new BigInteger[33000];

        // 초기값 설정
        dp[0] = BigInteger.ZERO; // M1 = 0
        dp[1] = BigInteger.ONE;  // M2 = 1
        dp[2] = new BigInteger("2"); // M3 = 2
        dp[3] = new BigInteger("3"); // M4 = 3

        // 수열 미리 계산 (최대치까지)
        for (int i = 4; i < 33000; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2])
                    .add(dp[i - 3])
                    .add(dp[i - 4]);
        }

        // n번의 테스트 케이스 처리
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line == null) break;

            StringTokenizer st = new StringTokenizer(line);
            int idx = 0;
            boolean isNautilus = true;

            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                BigInteger inputVal = new BigInteger(token);

                // 현재 위치의 dp값과 입력값이 다르면 SNAIL
                // 혹은 입력된 수열이 미리 계산한 범위를 넘어가도 SNAIL 처리
                if (idx >= 33000 || !dp[idx].equals(inputVal)) {
                    isNautilus = false;
                    break;
                }
                idx++;
            }

            if (isNautilus) {
                System.out.println("NAUTILUS");
            } else {
                System.out.println("SNAIL");
            }
        }
    }
}