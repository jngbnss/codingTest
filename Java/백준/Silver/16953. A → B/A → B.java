import java.io.*;
import java.util.*;

public class Main {
    static long a,b,cnt=1,ret=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
//        b = Integer.parseInt(st.nextToken());

        go(a,1);
        System.out.println(ret==Integer.MAX_VALUE?-1:ret);

    }
    static void go(long a,long cnt){
        if(a>=b){
            if(a==b) {
                ret = Math.min(ret, cnt);
            }
            return;
        }
        go(a*2,cnt+1);
        go(a*10+1,cnt+1);

    }
}
