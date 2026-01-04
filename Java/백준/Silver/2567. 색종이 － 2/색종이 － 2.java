//package im.q2567;
import java.io.*;
import java.util.*;
public class Main {
    static int[][]arr = new int[101][101];
    static int[]dy = {-1,0,1,0};
    static int[]dx = {0,-1,0,1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            for (int j = y; j <y+10 ; j++) {
                for(int k=x;k<x+10;k++){
                    arr[j][k] = 1;
                }

            }
        }
        int ret =0;
        for (int y = 0; y <101; y++) {
            for(int x=0;x<101;x++){
                if(arr[y][x]==1){
                    for(int d=0;d<4;d++){
                        int ny = y+dy[d];
                        int nx = x+dx[d];

                        if(ny<0||nx<0||ny>100||nx>100||arr[ny][nx]==0) ret++;
                    }
                }
            }

        }
        System.out.println(ret);

    }
}
