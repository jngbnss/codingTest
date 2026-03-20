import java.io.*;
import java.util.*;

public class Main {
    static int n, m, ret,k;
    static int arr[][], visited[][][];
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, -1, 0, 1};
    static int jy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int jx[] = {-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken()); // 행
        ret = Integer.MAX_VALUE;

        arr = new int[n][m];
        visited = new int[n][m][k+1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        go(0, 0, 0); // y x 방문횟수 k

        // 디버깅
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(visited[i][j][k]+" ");
//            }
//            System.out.println();
//        }

        //
    }

    static void go(int y, int x, int cnt) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{y, x,k});
        visited[y][x][k] = 1;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            y = now[0];
            x = now[1];
            int currentK = now[2];

            if(y==n-1&&x==m-1){
                System.out.println(visited[y][x][currentK]-1);
                return;
            }

            if (currentK> 0) {
                for (int j = 0; j < 8; j++) {
                    int ny = y + jy[j];
                    int nx = x + jx[j];

                    if (ny < 0 || nx < 0 || ny >= n || nx >= m) {
                        continue;
                    }
                    if (arr[ny][nx] == 0 && visited[ny][nx][currentK-1] == 0) {
//                        k--;
                        visited[ny][nx][currentK-1] = visited[y][x][currentK] + 1;
                        q.offer(new int[]{ny, nx,currentK-1});
                    }
                }
            }

            for (int i = 0; i < 4; i++) {

                int ny = y+dy[i];
                int nx = x+dx[i];

                if(ny<0||nx<0||ny>=n||nx>=m){
                    continue;
                }
                if(arr[ny][nx] == 0&&visited[ny][nx][currentK] ==0){
                    visited[ny][nx][currentK] = visited[y][x][currentK]+1;
                    q.offer(new int[]{ny,nx,currentK});
                }
            }
        }
        System.out.println(-1);

        /*
        if(cnt>ret){
            return;
        }
        visited[y][x] = 1;
        if(y==n-1&&x==m-1){
            ret = Math.min(ret,cnt);
        }

        for(int i=0;i<4;i++){
            int ny = y+dy[i];
            int nx = x+dx[i];

            if(ny<0||nx<0||ny>=n||nx>=m){
                continue;
            }
            if(arr[ny][nx] == 0&&visited[ny][nx] ==0){
                go(ny,nx,cnt+1,k);
            }
            if(k>0){
                for(int j=0;j<8;j++){
                    ny = y+jy[j];
                    nx = x+jx[j];
                }

                if(ny<0||nx<0||ny>=n||nx>=m){
                    continue;
                }
                if(arr[ny][nx] == 0&&visited[ny][nx] ==0){
                    go(ny,nx,cnt+1,k-1);
                }
            }
        }

         */

    }
}
