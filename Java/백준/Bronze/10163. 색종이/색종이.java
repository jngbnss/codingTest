//package im.q10163;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[1004][1004];
        int[] cnt = new int[104];
        for (int i = 1; i <=n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for(int j=a;j<a+c;j++){
                for(int k=b;k<b+d;k++){
                    arr[j][k]=i;
                }
            }
        }
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                cnt[arr[i][j]]++;
            }
        }
        for (int i = 1; i <=n; i++) {
            System.out.println(cnt[i]);

        }



    }
}