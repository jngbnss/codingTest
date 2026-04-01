import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 100004;
    static int n;
    static long memo[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        memo = new long[n + 1];
        Arrays.fill(memo, INF); //초기화
        //아니면 여기서 2랑 5를 미리 입력해줘야하나?
//        memo[2] = 1;
//        memo[5] = 1;
//        Arrays.fill(memo,INF);
        long ret = dp(n);
        if (memo[n] >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(ret);
//            System.out.println(memo[n]);
        }
    }

    static long dp(int n) {
        //if(n==0) return 0;
        if (n <= 0) {
            return INF;
        }
        //2와5의 동전
        //기저사례
        if (n == 2 || n == 5) {
            return memo[n] = 1;
        }

        //메모이제이션
        if (memo[n] != INF) {
            return memo[n];
        }

        // 로직
        long ret = Math.min(dp(n - 2), dp(n - 5)) + 1;
        memo[n] = ret >= INF ? INF : ret;
        //작은 거 구해야해서 -1말고 INF
        return memo[n];
    }
}

