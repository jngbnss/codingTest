//package d1231.b5.qb5;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
//        int y = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        System.out.println( (A+B)%C);
        System.out.println( ((A%C) + (B%C))%C);
        System.out.println(  (A*B)%C);
        System.out.println(  ((A%C) * (B%C))%C);
    }
}
