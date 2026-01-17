import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        int a = Integer.parseInt(st.nextToken());
        arr[0] =a;
        int b = Integer.parseInt(st.nextToken());
        arr[1] = b;
        int c = Integer.parseInt(st.nextToken());
        arr[2] = c;
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}