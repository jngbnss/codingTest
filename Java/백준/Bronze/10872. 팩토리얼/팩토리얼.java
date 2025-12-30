//package b5.d1230.q10872;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());

        long ret = 1;
        if(n==0||n==1){
            ret = 1;
        }
        else {
            for (int i = 1; i <= n; i++) {
                ret *= i;
            }
        }
            System.out.println(ret);
    }
}
