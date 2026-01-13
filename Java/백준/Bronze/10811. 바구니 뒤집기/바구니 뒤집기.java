
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+2];
        for(int i=0;i<=n;i++){
            arr[i] = i;
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int big = b;
            int[] temp = new int[b - a + 1];
            int idx=0;
            for(int j=a;j<=b;j++){
                temp[idx++] = arr[j];
            }
            idx = 0;
            for(int j=b;j>=a;j--){
                arr[j] = temp[idx++];
            }
//            for(int k=1;k<=n;k++){
//                System.out.print(arr[k]+" ");
//            }
//            System.out.println();
        }
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}