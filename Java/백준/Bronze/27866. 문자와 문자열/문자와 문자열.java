//package d1231.b5.q27866;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        n--;
        System.out.println(s.charAt(n));
    }
}
