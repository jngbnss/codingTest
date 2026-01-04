//package im.q2563;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[104][104];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int i=a;i<a+10;i++){
                for(int j=b;j<b+10;j++){
                    if(arr[i][j]>100) continue;
                    else {
                        arr[i][j] = 1;
                    }
                }
            }

        }
        int ret =0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(arr[i][j]==1){
                    ret++;
                }
            }
        }
        System.out.println(ret);
    }
}
