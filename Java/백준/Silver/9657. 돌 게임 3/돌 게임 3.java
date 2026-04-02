import java.io.*;
import java.util.*;
public class Main {
    static final int UNUSED = -1_000_001;
    static int n;
    static int memo[];
    static int arr[];
    public static void main(String[] args) throws IOException{
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());

        memo = new int[1004];
//        arr = new int[];
        Arrays.fill(memo,UNUSED);

        if(dp(n)==1){
            System.out.println("SK");
        }else{


            System.out.println("CY");
        }

    }

    static int dp(int idx){
        //기저사례
         if(idx==1||idx==3||idx==4) { //마지막에 먼저하는 상근이가 이긴다.
             return 1;
         }
         if(idx<=0){
             return 0;
         }
         if(idx==2){
             return 0;
         }

        if(memo[idx]!=UNUSED){
            return memo[idx];
        }


        if(dp(idx-1)==0||dp(idx-3)==0||dp(idx-4)==0){
            return memo[idx] = 1;
        }
        return memo[idx] = 0;
    }

}
