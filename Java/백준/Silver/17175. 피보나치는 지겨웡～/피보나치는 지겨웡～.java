import java.io.*;
import java.util.*;
public class Main {
    static final int UNUSED = -1_000_001;
    static int n,cnt;
    static long memo[];
    public static void main(String[] args) throws IOException{
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo = new long[10000004];
//        arr = new int[];
        Arrays.fill(memo,UNUSED);
//        System.out.println(dp(n));
        dp(n);
        System.out.println(memo[n]);
//        System.out.println(cnt);
    }

    static long dp(int idx){
        cnt++;
        //기저사례
         if(idx<2){
             return memo[idx] = 1;
         }

        if(memo[idx]!=UNUSED){
            return memo[idx];
        }


        return memo[idx] = (dp(idx-1)+dp(idx-2)+1)%1000000007;
    }

}
