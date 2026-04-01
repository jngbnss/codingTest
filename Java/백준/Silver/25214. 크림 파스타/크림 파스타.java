import java.io.*;
import java.util.*;

public class Main {
    static final int UNUSED = -1_000_001;
    static int n;
    static int memo[], arr[], minArr[];

    public static void main(String[] args) throws IOException {
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        minArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        memo = new int[n];
        Arrays.fill(memo, UNUSED);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(dp(i)).append(" ");// 앞에 애들이랑 비교할때 값이 나와야겠는데?
        }
        System.out.println(sb.toString());

    }

    static int dp(int idx) {
        //기저사례
        if (idx == 0) {
            minArr[idx] = arr[idx];
            return memo[idx] = 0;
        }

        if (memo[idx] != UNUSED) {
            return memo[idx];
        }

        //3. 재귀 호출 : 이전 단계(idx-1)의 상태를 먼저 완성시킴
        int prev = dp(idx - 1);

        //4. 상태 갱신
        // 현재까지의 최솟값 =  Min( 이전까지의 최솟값, 현재 값)
        minArr[idx] = Math.min(minArr[idx - 1], arr[idx]);

        return memo[idx] = Math.max(prev, arr[idx] - minArr[idx - 1]);

    }

}
