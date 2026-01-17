import java.io.*;
import java.util.*;

public class Main {
    static int [][]arr = new int[30][30];
    static int [][]visited = new int[30][30];
    static int[]dy={-1,0,1,0};
    static int[]dx={0,-1,0,1};
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] =s.charAt(j)-'0';
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1&&visited[i][j]==0){
                    int cnt = dfs(i,j);
                    result.add(cnt);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (Integer integer : result) {
            System.out.println(integer);
        }

    }

    private static int dfs(int y, int x) {
        int temp = 1;
        visited[y][x] = 1;
        for(int i=0;i<4;i++){
            int ny = y+dy[i];
            int nx = x+dx[i];

            if (ny < 0||nx<0||ny>=n||nx>=n) continue;
            if(arr[ny][nx]==1&&visited[ny][nx]==0){
                temp+=dfs(ny,nx);
            }


        }
        return temp;
    }
}