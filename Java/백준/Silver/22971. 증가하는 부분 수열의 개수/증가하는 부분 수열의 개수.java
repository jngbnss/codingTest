import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static long memo[], arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        memo = new long[1000004];
        arr = new long[1000004];

        Arrays.fill(memo, -1);
        Arrays.fill(arr, 1);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(dp(i)).append(" ");// i를 끝으로 하는 연속 합 출력
        }
        System.out.println(sb.toString());
    }

    static long dp(int idx) {
        if (idx == 0) {
            return memo[idx] = 1;
        }

        if (memo[idx] != -1) {
            return memo[idx];
        }

        long cnt = 1;

        for(int j=0;j<idx;j++){
            if(arr[j]<arr[idx]){
                cnt = (cnt+dp(j)) % 998244353;
            }
        }

        return memo[idx]=cnt;
    }
}
