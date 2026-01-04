//package im.q2589;
import java.io.*;
import java.util.*;

public class Main {
    static char[][]arr = new char[54][54];
    static int[][]visited = new int[54][54];
    static int[]dy = {-1,0,1,0};
    static int[]dx = {0,-1,0,1};
    static int n,m;
    static int cnt;
    public static void main(String[] args) throws IOException{
        int ret = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i =0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = s.charAt(j);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='L'){
                    visited = new int[54][54];
                    cnt = 0;
                    bfs(i,j);
                    ret = Math.max(ret,cnt);
                }
            }

        }
        System.out.println(ret-1);
    }

    static void bfs(int y,int x){
        Deque<int[]> queue = new ArrayDeque<>();
        visited[y][x] = 1;
        queue.offer(new int[]{y,x});

        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            y = poll[0];
            x = poll[1];
            for (int i = 0; i < 4; i++) {
                int ny = poll[0]+dy[i];
                int nx = poll[1]+dx[i];

                if(ny<0||nx<0||ny>=n||nx>=m) continue;
                if(arr[ny][nx]=='L'&&visited[ny][nx] ==0 ){
                    visited[ny][nx] = visited[y][x]+1;
                    cnt = Math.max(cnt,visited[ny][nx]);
                    queue.offer(new int[]{ny,nx});
                }
            }

        }



    }


}