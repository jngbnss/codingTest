import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(m*c);
    }
}
