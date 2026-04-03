import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static long memo[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());

        memo = new long[1000004];
        Arrays.fill(memo,100000);

        System.out.println(dp(n));
    }

    static long dp(int idx){
        if(idx==1){
            return memo[idx] = 0;
        }
        if(idx<1){
            return memo[idx] =99999999;
        }

        if(memo[idx]!=100000){
            return memo[idx];
        }

        if(idx%3==0){
            memo[idx] = dp(idx/3)+1;
        }
        if(idx%2==0){
            memo[idx] = Math.min(memo[idx],dp(idx/2) +1);
        }
            memo[idx] = Math.min(memo[idx],dp(idx-1)+1);

        return memo[idx];
    }
}
