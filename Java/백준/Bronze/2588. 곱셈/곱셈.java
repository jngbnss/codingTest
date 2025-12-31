//package d1231.b5.qb5;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
//        int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
        int c = B%10;
        int b = (B/10)%10;
        int a= B/100;
        System.out.println(y*c);
        System.out.println(y*b);
        System.out.println(y*a);
        System.out.println(y*B);
    }
}
