import java.io.*;
import java.util.*;

public class Main {
    static int n,arr[];
    static long memo[];
    static long ret;

    static long dp(int idx) {
        if (memo[idx] >= 0) {
            return memo[idx];
        }
        long sum = 1;
        for(int j=0;j<idx;j++){
            if(arr[j]<arr[idx]){
                sum = (sum+dp(j))%998244353;
            }
        }
        return memo[idx] = sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr =new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        memo = new long[5004];
        Arrays.fill(memo, -1);
        for (int i = 0; i < n; i++) {
            System.out.print(dp(i)+" ");
        }
    }

}
