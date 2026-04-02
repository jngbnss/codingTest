import java.io.*;
import java.util.*;
import java.math.BigInteger; // BigInteger 임포트

public class Main {
    // BigInteger를 사용하므로 초기값은 null 체크로 대체 가능합니다.
    static BigInteger[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // 문제의 P 최대 범위가 10,000이므로 넉넉하게 할당합니다.
        memo = new BigInteger[10001];

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            // Q는 여전히 long 범위로 받을 수 있습니다 (나머지 연산용)
            BigInteger q = new BigInteger(st.nextToken());

            // 피보나치 수 계산
            BigInteger result = dp(p);

            // 결과값 % q 연산 후 출력 형식에 맞게 저장
            // BigInteger의 remainder 메서드를 사용합니다.
            sb.append("Case #").append(i).append(": ").append(result.remainder(q)).append("\n");
        }
        System.out.print(sb.toString());
    }

    static BigInteger dp(int idx) {
        // 기저 사례
        if (idx == 0) return memo[idx] = BigInteger.ZERO;
        if (idx == 1) return memo[idx] = BigInteger.ONE;

        // 메모이제이션 확인 (null이면 계산된 적이 없는 것)
        if (memo[idx] != null) {
            return memo[idx];
        }

        // BigInteger는 '+' 연산자 대신 .add() 메서드를 사용해야 합니다.
        return memo[idx] = dp(idx - 1).add(dp(idx - 2));
    }
}