import java.io.*;
import java.util.*;

public class Main {
    static int n, k, ret, tc = 1;
    static int arr[][], dist[][];
    static int dy[] = {-1, 0, 1, 0,};
    static int dx[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            arr = new int[n][n];
            dist = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dist[i], Integer.MAX_VALUE);
            }
           
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            go(0, 0, arr[0][0]);
            ret = dist[n - 1][n - 1];
            sb.append("Problem ").append(tc++).append(": ");

            sb.append(ret).append("\n");

        }
        System.out.println(sb.toString());

    }

    static void go(int y, int x, int cost) {
        dist[y][x] = cost;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.offer(new int[]{y, x, cost});

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            y = now[0];
            x = now[1];
            cost = now[2];
            if (cost != dist[y][x]) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || nx < 0 || ny >= n || nx >= n) {
                    continue;
                }
                int nextCost = arr[ny][nx] + cost;
                if (dist[ny][nx] > nextCost) {
                    dist[ny][nx] = nextCost;
                    pq.offer(new int[]{ny, nx, nextCost});
                }
            }
        }


    }

}
