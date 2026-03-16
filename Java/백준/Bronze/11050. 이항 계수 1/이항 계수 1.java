import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        if(b>a/2);{
            b = a-b;
        }

        // n C k
        // n! 나누기
        // n-k ! k!
        long ret = 1;
        for(long i=a;i>=a-b+1;i--){
            ret*=i;
        }
        for(int i=2;i<=b;i++){
            ret/=i;
        }
        System.out.println(ret);
    }
}
