import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 1000004;
    static int n;
    static long memo[];
    static long arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        memo = new long[INF];
        arr = new long[INF];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.fill(memo, -1);
        // 올라가는거 체크 , 내려가는거 체크를 하는데
        // 지금 인덱스에서 아니면
        // 그냥 그 다음 인덱스에서부터 진행하면 되려나?
        // 그럼 메모이제이션을 어디서 진행하지?
        long ret = 0;
        for (int i = 0; i < n; i++) {
//            ret = Math.max(up(i),ret);
            ret = Math.max(down(i), ret);
        }
        Arrays.fill(memo, -1);
//        ret =0;
        for (int i = 0; i < n; i++) {
            ret = Math.max(up(i), ret);
//            ret = Math.max(down(i),ret);
        }
        System.out.println(ret);

    }

    static long up(int idx) {
        //기저사례
        if (idx == n - 1) {
            return 1;
        }

        if (memo[idx] != -1) {
            return memo[idx];
        }

        long res = 1;
        if (arr[idx] <= arr[idx + 1]) {
            res = up(idx + 1) + 1;
        }
        return memo[idx] = res;


    }

    static long down(int idx) {
        //기저사례
        if (idx == n - 1) {
            return 1;
        }

        if (memo[idx] != -1) {
            return memo[idx];
        }

        long res = 1;
        if (arr[idx] >= arr[idx + 1]) {
            res = down(idx + 1) + 1;
        }
        return memo[idx] = res;


    }

}
