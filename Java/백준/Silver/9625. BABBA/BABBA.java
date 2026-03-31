import java.io.*;
import java.util.*;
public class Main {
    static int n,m;
    static long dp[][];


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());


//        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        dp = new long[50][2];
        dp[0][0] = 1;
        dp[0][1] = 0;

        for(int i=1;i<=45;i++){
            dp[i][0] = dp[i-1][1];
            dp[i][1] = dp[i-1][0]+(dp[i-1][1]);
        }

        System.out.println(dp[n][0]+" "+dp[n][1]);
    }
}
