import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static final int INF = 100004;
    static int n;
    static BigInteger memo[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo = new BigInteger[INF];
//        Arrays.fill(memo,-1);
//        Arrays.fill(memo,INF);
        System.out.println(dp(n));

    }

    static BigInteger dp(int n) {
        // 기저 사례
        if (n == 0) {
            return BigInteger.ZERO;
        }
        if (n == 1) {
            return BigInteger.ONE;
        }

        // 메모이제이션 확인 (null이면 아직 계산 안 된 것)
        if (memo[n] != null) {
            return memo[n];
        }

        // BigInteger 연산: dp(n-1) + dp(n-2)
        // subtract와 add 메서드 사용
        return memo[n] = dp(n - 1).add(dp(n - 2));
    }
}
