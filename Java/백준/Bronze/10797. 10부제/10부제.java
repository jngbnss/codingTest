import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result =0;
        for (int i = 0; i < 5; i++) {
            int x = Integer.parseInt(st.nextToken());
            if(x==n) result++;
        }
        System.out.println(result);

    }
}