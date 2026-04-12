import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int arr[][], visited[][];
    static ArrayList<Integer> list;
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, -1, 0, 1};

    static int dfs(int y, int x) {
        visited[y][x] = 1;
        int cnt = 1;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 0 || ny >= n || nx < 0 || nx >= m) {
                continue;
            }
            if (arr[ny][nx] == 1 && visited[ny][nx] == 0) {
                cnt += dfs(ny, nx);
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 행 먼저 나온다
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new int[n][m];

        list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1 && visited[i][j] == 0) {
                    list.add(dfs(i, j));
                }
            }
        }
        System.out.println(list.size());
        if (list.size() == 0) {
            System.out.println(0);
        } else {

            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list.get(0));

        }
    }
}
