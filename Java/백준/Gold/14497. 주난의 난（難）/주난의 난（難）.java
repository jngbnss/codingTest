import java.io.*;
import java.util.*;
public class Main {
    static int n,m,x1,y1,x2,y2;
    static char arr[][];
    static int visited[][];
    static int dy[]={-1,0,1,0};
    static int dx[]={0,-1,0,1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());
        x1--;
        x2--;
        y1--;
        y2--;

        arr = new char[n][m];
        for(int i=0;i<n;i++){
            String line = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = line.charAt(j);
            }
        }
        int cnt =0;
        while(true){
            visited = new int[n][m];
            cnt++;
            go(x1,y1);
            if(visited[x2][y2]==1){
                break;
            }
        }

        System.out.println(cnt);
    }
    static void go(int y,int x){
        visited[y][x] = 1;
        for(int i=0;i<4;i++){
            int ny = y+dy[i];
            int nx = x+dx[i];
            if(ny<0||nx<0||ny>=n||nx>=m) continue;
            if((arr[ny][nx]=='0'||arr[ny][nx]=='#')&&visited[ny][nx]==0){
                go(ny,nx);
            }else if(arr[ny][nx]=='1'){
                arr[ny][nx] = '0';
                visited[ny][nx] = 1;
            }
        }
    }
}
