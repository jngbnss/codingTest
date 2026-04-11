import java.io.*;
import java.util.*;

public class Main {
    static int n, cost = Integer.MAX_VALUE;
    static int arr[][], visited[][];
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, 1, 0, -1};
    static ArrayList<int[]> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new int[n][n];

        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                list.add(new int[]{i, j});
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    go(list.get(i), list.get(j), list.get(k));
                    // 좌표 중에 3개 뽑아서
                    // 설치할수있으면
                    // 비용 작은거로 갱신하기
                }
            }
        }
        System.out.println(cost);

    }

    static void go(int[] i, int[] j, int[] k) {
        for (int c = 0; c < n; c++) {
            Arrays.fill(visited[c], 0);
        }
        if (canMake(i, j, k)) {
            int temp = 0;
            cal(temp, i, j, k);
        }
    }

    static void cal(int temp, int[] i, int[] j, int[] k) {
        int y = i[0];
        int x = i[1];
        temp += arr[y][x];
        for (int dir = 0; dir < 4; dir++) {
            int ny = y + dy[dir];
            int nx = x + dx[dir];
            if (ny < 0 || ny >= n || nx < 0 || nx >= n) {
                continue;
            }
            temp += arr[ny][nx];
        }
        y = j[0];
        x = j[1];
        temp += arr[y][x];
        for (int dir = 0; dir < 4; dir++) {
            int ny = y + dy[dir];
            int nx = x + dx[dir];
            if (ny < 0 || ny >= n || nx < 0 || nx >= n) {
                continue;
            }
            temp += arr[ny][nx];
        }

        y = k[0];
        x = k[1];
        temp += arr[y][x];
        for (int dir = 0; dir < 4; dir++) {
            int ny = y + dy[dir];
            int nx = x + dx[dir];
            if (ny < 0 || ny >= n || nx < 0 || nx >= n) {
                continue;
            }
            temp += arr[ny][nx];
        }
        cost = Math.min(cost, temp);
    }


    static boolean canMake(int[] i, int[] j, int[] k) {
        int y = i[0];
        int x = i[1];
        visited[y][x] = 1;
        for (int dir = 0; dir < 4; dir++) {
            int ny = y + dy[dir];
            int nx = x + dx[dir];

            if (ny < 0 || ny >= n || nx < 0 || nx >= n || visited[ny][nx] == 1) {
                return false;
            }
            visited[ny][nx] = 1;
        }
        y = j[0];
        x = j[1];
        visited[y][x] = 1;
        for (int dir = 0; dir < 4; dir++) {
            int ny = y + dy[dir];
            int nx = x + dx[dir];
            if (ny < 0 || ny >= n || nx < 0 || nx >= n || visited[ny][nx] == 1) {
                return false;
            }
            visited[ny][nx] = 1;
        }

        y = k[0];
        x = k[1];
        visited[y][x] = 1;
        for (int dir = 0; dir < 4; dir++) {
            int ny = y + dy[dir];
            int nx = x + dx[dir];
            if (ny < 0 || ny >= n || nx < 0 || nx >= n || visited[ny][nx] == 1) {
                return false;
            }
            visited[ny][nx] = 1;
        }
        return true;
    }
}
