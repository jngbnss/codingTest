import java.io.*;
import java.util.*;
import java.math.BigInteger; // BigInteger 임포트 필수

public class Main {
    // long 대신 BigInteger 배열 사용
    static BigInteger dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 최대 범위인 490을 수용할 수 있도록 설정
        dp = new BigInteger[491];

        // 피보나치 초기값 설정 (BigInteger 상수를 활용)
        dp[0] = BigInteger.ZERO; 
        dp[1] = BigInteger.ONE;

        // BigInteger는 '+' 연산자 대신 .add() 메서드를 사용합니다.
        for (int i = 2; i <= 490; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        String input;
        while ((input = br.readLine()) != null) {
            String trimmed = input.trim();
            if (trimmed.isEmpty()) continue; // 빈 줄 처리
            
            int x = Integer.parseInt(trimmed);

            if (x == -1) break;

            // 출력 형식에 맞춰서 dp[x] 출력
            System.out.println("Hour " + x + ": " + dp[x] + " cow(s) affected");
        }
    }
}