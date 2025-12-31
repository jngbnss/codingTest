//package d1231.b5.q9086;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length()-1));
//            System.out.println(s.charAt(0));
        }

    }
}
