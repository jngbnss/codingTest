import java.io.*;
import java.util.*;
public class Main {
    static int m,n,h;
    static int arr[][][],visited[][][];
    static ArrayDeque<int[]>q;
    static int dy[]={-1,0,1,0,0,0};
    static int dx[]={0,-1,0,1,0,0};
    static int dz[]={0,0,0,0,-1,1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        arr = new int[n][m][h];
        visited = new int[n][m][h];

        q = new ArrayDeque<>();


        // m은 열 n은 행 h는 높이
        for(int k = 0;k<h;k++){
            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<m;j++){
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if(arr[i][j][k]==1){
                        q.offer(new int[]{i,j,k});
                        visited[i][j][k] = 1;
                    }


                }
            }
        }
        while(!q.isEmpty()){
            int[] poll = q.poll();
            int y = poll[0];
            int x = poll[1];
            int z = poll[2];

            for(int i=0;i<6;i++){
                int ny = y+dy[i];
                int nx = x+dx[i];
                int nz = z+dz[i];

                if(ny<0||nx<0||nz<0||ny>=n||nx>=m||nz>=h){
                    continue;
                }
                if(arr[ny][nx][nz]==0&&visited[ny][nx][nz]==0){
                    visited[ny][nx][nz]=visited[y][x][z]+1;
                    q.offer(new int[]{ny,nx,nz});
                }

            }
        }
        int ret = 0;
        boolean flag = true;
        for(int k=0;k<h;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j][k]==0&&visited[i][j][k]==0){
                        ret = -1;
                        flag = false;
                        break;
                    }
                    ret = Math.max(visited[i][j][k]-1,ret);
                }
                if(!flag) break;
            }if(!flag) break;
        }
        System.out.println(ret);

    }
}

