import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    static int n,m;
    static long arr[];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new long[100004];
        Arrays.fill(arr,1000000);
        arr[2] = 1;
        arr[4] = 2;
        arr[5] = 1;
        for(int i=6;i<=n;i++){
            arr[i] = Math.min(arr[i-2],arr[i-5]) +1;
        }
        if(arr[n]>=1000000){
            System.out.println(-1);
        }else
            System.out.println(arr[n]);

    }
}
