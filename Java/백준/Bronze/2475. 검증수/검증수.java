//package d1231.b5.q2475;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[]arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ret = go(arr);
        System.out.print(ret);
    }

    private static int go(int[] arr) {
        int sum = 0;
        for(int i=0;i<5;i++){
            sum+=arr[i]*arr[i];
            sum%=10;

        }
        return sum%10;
    }
}
