import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <=n; i++) {

            int x = Integer.parseInt(st.nextToken());
            arr[i] = arr[i-1]+x;
            
            
        }
        int result = Integer.MAX_VALUE;
        for (int i = 1; i <=n-1 ; i++) {
            int temp = arr[i]-(arr[n]-arr[i]);
            int tempabs =Math.abs(temp) ;
//            System.out.println(tempabs);
            result = Math.min(result,tempabs);
//            System.out.println(arr[i]+" "+(arr[n]-arr[i]));
        }
        System.out.println(result);
        

    }
}