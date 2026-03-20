import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long ret =0;
        long ret1 =0;
        long ret2 =0;
        for(long i=1;i<=n;i++){
            ret +=i;
            ret2 += i*i*i;
        }
        ret1 = ret*ret;
        System.out.println(ret);
        System.out.println(ret1);
        System.out.println(ret2);
    }
}
