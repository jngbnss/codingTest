//package d1231.b5.qb5;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String ret ="";
            for(int j=n-i;j>0;j--){
                ret+=" ";
            }
            for (int j = 0; j < i; j++) {
                ret+="*";
            } System.out.println(ret);
        }

    }
}
