import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a + 1];
        for (int i = 0; i < a + 1; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int temp = arr[y];
            arr[y] = arr[x];
            arr[x] = temp;

        }
        for (int i = 1; i <= a; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}