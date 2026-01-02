//package baekjoon.q2559;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int []arr = new int[n+4];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 1; i <=n; i++) {
            int x = Integer.parseInt(st1.nextToken());
            arr[i] = arr[i-1]+x;
        }
        int ret = -10000004;
        for(int i=m;i<=n;i++){
            ret = Math.max(ret,arr[i]-arr[i-m]);
        }
        System.out.println(ret);
    }
}

