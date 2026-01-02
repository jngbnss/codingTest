
import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr = new int[54][54];
    static int[][] visited = new int[54][54];
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, -1, 0, 1};
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int ret = 0;
            for (int i = 0; i < 54; i++) {
                Arrays.fill(arr[i], 0);
                Arrays.fill(visited[i], 0);
            }

            for (int i = 0; i < k; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st1.nextToken());
                int x = Integer.parseInt(st1.nextToken());
                arr[y][x] = 1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1 && visited[i][j] == 0) {
                        ret++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(ret);

        }
    }

    private static void dfs(int y, int x) {
        visited[y][x] = 1;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= n || nx >= m) {
                continue;
            }
            if (arr[ny][nx] == 1 && visited[ny][nx] == 0) {
                dfs(ny, nx);
            }

        }
    }
}

