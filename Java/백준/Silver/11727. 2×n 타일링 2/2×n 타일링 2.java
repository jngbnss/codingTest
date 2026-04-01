import java.io.*;
import java.util.*;

public class Main {
    static final int UNUSED = -1;
    static int n;
    static int memo[];

    public static void main(String[] args) throws IOException {
        /**
         * 설계다하고 진행하자
         * 1의 갯수랑
         * 가능한 2의 갯수만 찾으면 되는데
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());

        memo = new int[1004];
        Arrays.fill(memo, UNUSED);

        System.out.println(dp(n));

    }

    static int dp(int idx) {
        //기저사례
        if (idx == 1) {
            return memo[idx] = 1;
        }
        if (idx == 2) {
            return memo[idx] = 3;
        }

        if (memo[idx] != UNUSED) {
            return memo[idx];
        }

        return memo[idx] = (dp(idx - 1) + dp(idx - 2)*2) % 10007;
    }

}
