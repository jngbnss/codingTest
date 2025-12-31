//package d1231.b5.qb5;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int []arr = {1,1,2,2,2,8};
        for (int i = 0; i < arr.length; i++) {
            int input = Integer.parseInt(st.nextToken());
            int n = arr[i] - input;
            System.out.print(n+" ");
        }



    }
}
