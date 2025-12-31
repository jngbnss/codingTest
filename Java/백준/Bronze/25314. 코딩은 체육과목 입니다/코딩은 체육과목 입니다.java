//package d1231.b5.qb5;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int x = n/4;
        for (int i = 0; i < x; i++) {
            System.out.print("long ");
        }
        System.out.println("int");

    }
}
