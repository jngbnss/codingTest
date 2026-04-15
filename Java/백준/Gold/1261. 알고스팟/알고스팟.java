import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static final int INF = 10_004;
    static int n, m;
    static int[][] dist;
    static int[][] arr;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
        }
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j) - '0';

            }
        }

        dijk(0, 0, arr[0][0]);
        System.out.println(dist[n - 1][m - 1]);


    }

    static void dijk(int y, int x, int cost) {
        dist[y][x] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(y, x, dist[y][x] ));

        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            y = poll.y;
            x = poll.x;
            cost = poll.cost;

            if (cost != dist[y][x]) {
                continue;
            }
            if (y == n-1 && x == m-1) {
                return;
            }
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || ny >= n || nx < 0 || nx >= m) {
                    continue;
                }

                int nextCost = dist[y][x] + arr[ny][nx];
                if (nextCost < dist[ny][nx]) {
                    dist[ny][nx] = nextCost;
                    pq.offer(new Node(ny, nx, nextCost));
                }

            }

        }

    }

    static class Node implements Comparable<Node> {
        int y;
        int x;
        int cost;

        public Node(int y, int x, int cost) {
            this.y = y;
            this.x = x;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
}
