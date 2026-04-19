import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    static int testCase, n, k;
    static ArrayList<int[]> list;
    static int arr[][], visited[][];
    static int ret;
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= testCase; tc++) {
            sb.append("#").append(tc).append(" ");
            ret = 0; // 가장 긴 거리
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            arr = new int[n][n];
            int mx = 0;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    mx = Math.max(mx, arr[i][j]);
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == mx) {
                        visited = new int[n][n];
                        dfs(i, j, 1, 1); // 현재 길이, 1이면  아직 안쓴거
                    }
                }
            }
            sb.append(ret).append("\n");
        }
        System.out.println(sb.toString());

    }

    static void dfs(int y, int x, int dist, int used) {

        ret = Math.max(ret, dist);
        visited[y][x] = 1;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= n || nx >= n || visited[ny][nx] == 1) {
                continue;
            }
            if (arr[ny][nx] < arr[y][x]) {

                dfs(ny, nx, dist + 1, used);
            } else if (used == 1 && arr[ny][nx] - k < arr[y][x]) {
                int original = arr[ny][nx];
                arr[ny][nx] = arr[y][x] - 1;
                dfs(ny, nx, dist + 1, 0);

                arr[ny][nx] = original;
            }


        }
        visited[y][x] = 0;

    }
}
