import java.io.*;
import java.util.*;
public class Main {
    static int n,m;
    static int arr[][];
    static int visited[][];
    static int dy[]={-1,0,1,0};
    static int dx[]={0,-1,0,1};
    static int sy,sx,cnt;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new int[n][m];
        for(int i=0;i<n;i++){
           st =  new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]==2){
                    sy = i;
                    sx = j;
                }
            }
        }

        go(sy,sx);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0&&arr[i][j]==0){
                    visited[i][j]=0;
                    System.out.print(visited[i][j]+" ");
                }else if(visited[i][j]==0&&arr[i][j]==1){
                    visited[i][j] = -1;
                    System.out.print(visited[i][j]+" ");
                }else{
                    System.out.print(visited[i][j]-1+" ");
                }

            }
            System.out.println();
        }


    }
    static void go(int sy,int sx){
        visited[sy][sx] = 1;
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sy,sx});
        while(!q.isEmpty()){
            int[] now = q.poll();
            sy = now[0];
            sx = now[1];
            for(int i=0;i<4;i++){
                int ny = sy+dy[i];
                int nx = sx+dx[i];

                if(ny<0||nx<0||ny>=n||nx>=m) continue;

                if(arr[ny][nx]!=0&&visited[ny][nx]==0){
                    visited[ny][nx] = visited[sy][sx]+1;
                    q.offer(new int[]{ny,nx});

                }
            }
        }

    }
}
