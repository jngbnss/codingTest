//package d1231.b5.q15964;
import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
        System.out.println(go(a,b));
    }

    private static long go(long a, long b) {
        return(a+b)*(a-b);
    }
}
