import java.io.*;
import java.util.*;
public class Main {
    static int n,m,visited[][],arr[][];
    static int dy[]={-1,0,1,0};
    static int dx[]={0,-1,0,1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new int[n][m];

        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = s.charAt(j)-'0';
            }
        }

        bfs(0,0);
        System.out.println(visited[n-1][m-1]);
    }
    static void bfs(int y,int x){
        visited[y][x] = 1;
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{y,x});
        while(!q.isEmpty()){
            int[] poll = q.poll();
            y = poll[0];
            x = poll[1];
            for(int i=0;i<4;i++){
                int ny = y+dy[i];
                int nx = x+dx[i];

                if(ny<0||nx<0||ny>=n||nx>=m){
                    continue;
                }
                if(arr[ny][nx] ==1&&visited[ny][nx] ==0){
                    visited[ny][nx] = visited[y][x]+1;
                    q.offer(new int[]{ny,nx});
                }
            }
        }
    }
}
