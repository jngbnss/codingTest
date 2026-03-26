import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static char arr[][];
    static int visited[][];
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        visited = new int[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        int teamW = 0;
        int teamB = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int ret = 0;
                if (arr[i][j] == 'W' && visited[i][j] == 0) {
                    ret = go(i, j, 'W');
                    teamW += ret * ret;
                } else if (arr[i][j] == 'B' && visited[i][j] == 0) {
                    ret = go(i, j, 'B');
                    teamB += ret * ret;
                }
            }
        }
        System.out.println(teamW + " " + teamB);
    }

    static int go(int y, int x, char c) {
        visited[y][x] = 1;
        int cnt = 1;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= n || nx >= m) {
                continue;
            }

            if (arr[ny][nx] == c && visited[ny][nx] == 0) {
                cnt += go(ny, nx, c);
            }

        }
        return cnt;
    }
}
