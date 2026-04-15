import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    /*
    0으로 진행하다 바뀌면 1로 바꾸고
    마지막 방에 dist넣으면 되지 않나

     */
    static int n;
    static int arr[][], dist[][];
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        go(0, 0, 0); // y x cost
        System.out.println(dist[n - 1][n - 1]);
    }

    static void go(int y, int x, int cost) {
        dist[y][x] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(y, x, cost));

        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            y = poll.y;
            x = poll.x;
            cost = poll.cost;
            if (cost != dist[y][x]) {
                continue;
            }
            if (y == n - 1 && x == n - 1) {
                return;
            }
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny < 0 || nx < 0 || ny >= n || nx >= n) {
                    continue;
                }

                int nextCost = dist[y][x];
                if (arr[ny][nx]==0) {
                    nextCost += 1;
                }
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
