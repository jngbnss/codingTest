import java.io.*;
import java.util.*;
public class Main {
    static int n,m;
    static long dp[];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp = new long[100];
        n = Integer.parseInt(br.readLine());
        dp[1] = 0;
        dp[2] = 1;
        for(int i=3;i<=10;i++){
            int half = i/2;
            int last = i-half;
            dp[i] = dp[half]+dp[last]+(half*last);
        }
        System.out.println(dp[n]);
    }
}
