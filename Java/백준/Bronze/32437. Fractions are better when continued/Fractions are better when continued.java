import java.io.*;
import java.util.*;
public class Main {
    static int n,m;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] dp = new long[50];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        System.out.println(dp[n]);

    }
}
