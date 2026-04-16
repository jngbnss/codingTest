import java.io.*;
import java.util.*;

public class Main {
    static int m, n;
    static int arr[][], dist[][];
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
//            st = new StringTokenizer(br.readLine());
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = (line.charAt(j) - '0');
            }
        }

        dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);

        }
        dijk(0, 0, 0);
        System.out.println(dist[n - 1][m - 1]);
    }

    static void dijk(int y, int x, int cost) {
        dist[y][x] = cost;
        PriorityQueue<int[]> pq = new PriorityQueue<>(((a, b) -> a[2] - b[2]));
        pq.offer(new int[]{y, x, cost});

        while (!pq.isEmpty()) {
            int[] poll = pq.poll();
            y = poll[0];
            x = poll[1];
            cost = poll[2];
            if (cost != dist[y][x]) {
                continue;
            }
            if (y == n - 1 && x == m - 1) {
                return;
            }
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny < 0 || nx < 0 || ny >= n || nx >= m) {
                    continue;
                }
                int nextCost = dist[y][x] + arr[ny][nx];
                if (nextCost < dist[ny][nx]) {
                    dist[ny][nx] = nextCost;
                    pq.offer(new int[]{ny, nx, nextCost});
                }
            }
        }
    }
}
