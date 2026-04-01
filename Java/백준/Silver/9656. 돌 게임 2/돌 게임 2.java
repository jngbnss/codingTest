import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 1004;
    static int n;
    static long memo[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo = new long[INF];
        Arrays.fill(memo, -1);
//        Arrays.fill(memo, INF); //최소값 아니니까 -1써도 될걸?
        if (dp(n) == 1) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }

    static long dp(int n) {
        if (n <= 0) {
            return 0; //0이면 마지막에 가져갔다는거
        }
        if (n == 1 || n == 3) { //
            return 1; //1이면 다음 사람이 이기는 거야
        }
        if (n == 2) {
            return 0;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        if (dp(n - 1) == 0 || (dp(n - 3) == 0)) {
            return memo[n] = 1; // 다음에 가져가는게 있으니까 내가 이긴다는건가?
        }
        return memo[n] = 0;
    }

}
