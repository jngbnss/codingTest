import java.io.*;
import java.util.*;
public class Main {
    static final int INF = 987654321;
    static int n;
    static long memo[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int cnt = n/2;
        if(n%2!=0){
            cnt++;
        }
        long ret = 1;
        for(int i=0;i<cnt;i++){
            ret = (ret*2)%16769023;
        }
        System.out.println(ret);

    }

}
