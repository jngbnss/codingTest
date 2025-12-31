//package d1231.b5.q15964;
import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(go(a,b));
    }

    private static int go(int a, int b) {
        return(a+b)*(a-b);
    }
}
