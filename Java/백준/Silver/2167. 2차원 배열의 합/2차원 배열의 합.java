import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int psum[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        psum = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=m;j++){
                int x = Integer.parseInt(st.nextToken());
                psum[i][j] = psum[i][j-1]+psum[i-1][j]-psum[i-1][j-1]+x;
            }
        }
        int k = Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            // 행 열
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
//            y1--;
//            x1--;
//            y2--;
//            x2--;
//            int ret = psum[y2][x2]+psum[y2][x1-1]-psum[y1-1][x2]-psum[y2][x1];
            int ret = psum[y2][x2] - psum[y1-1][x2]-psum[y2][x1-1]+psum[y1-1][x1-1];
            System.out.println(ret);
        }
    }
}
