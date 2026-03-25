import java.io.*;
import java.util.*;

public class Main {
    static int n, m, sy, sx, ey, ex;
    static int arr[][], visited[][], water[][];
    static ArrayDeque<int[]> q;
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new int[n][m];
        water = new int[n][m];
        for (int i = 0; i < n; i++) {
            //Arrays.fill(water, Integer.MAX_VALUE);
            for (int j = 0; j < m; j++) {
                water[i][j] = Integer.MAX_VALUE;
            }
        }
        q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
                if (arr[i][j] == '*') {
                    q.offer(new int[]{i, j});
                    water[i][j] = 1;
                } else if (arr[i][j] == 'S') {
                    sy = i;
                    sx = j;
                } else if (arr[i][j] == 'D') {
                    ey = i;
                    ex = j;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int y = poll[0];
            int x = poll[1];

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || nx < 0 || ny >= n || nx >= m) {
                    continue;
                }
                if (water[ny][nx] == Integer.MAX_VALUE && (arr[ny][nx] != 'X' && arr[ny][nx] != 'D')) {
                    water[ny][nx] = water[y][x] + 1;
                    q.offer(new int[]{ny, nx});
                }
            }
        }

        q = new ArrayDeque<>();
        bfs(sy, sx);
        int ret = visited[ey][ex] - 1;

        // 디버깅 시작
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(water[i][j]+" ");
//            }
//            System.out.println();
//        }
        // 디버깅 끝
        System.out.println(ret == -1 ? "KAKTUS" : ret);


    }

    static void bfs(int y, int x) {
        visited[y][x] = 1;
        q.offer(new int[]{y, x});
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            y = poll[0];
            x = poll[1];

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || nx < 0 || ny >= n || nx >= m) {
                    continue;
                }
                if (arr[ny][nx] != 'X' && visited[y][x] + 1 < water[ny][nx] && visited[ny][nx] == 0) {
                    visited[ny][nx] = visited[y][x] + 1;
                    q.offer(new int[]{ny, nx});
                }

            }
        }


    }

}

