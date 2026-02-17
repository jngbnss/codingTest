import java.io.*;
import java.util.*;

public class Main {
    static int M, N;
    static int[][] map;
    static int[][] dist;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken()); // 세로

        map = new int[N][M];
        dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
                dist[i][j] = Integer.MAX_VALUE; // 최소 비용 비교를 위해 초기값 무한대
            }
        }

        System.out.println(bfs(0, 0));
    }

    static int bfs(int x, int y) {
        // 우선순위 큐를 사용하여 벽을 적게 부순 순서대로 정렬 (다익스트라)
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(x, y, 0));
        dist[x][y] = 0;

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            // 목적지에 도착했다면 현재까지 부순 벽의 개수 반환
            if (current.x == N - 1 && current.y == M - 1) {
                return current.cost;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    // 더 적은 비용(벽 부수기)으로 해당 칸에 방문할 수 있는 경우
                    if (dist[nx][ny] > dist[current.x][current.y] + map[nx][ny]) {
                        dist[nx][ny] = dist[current.x][current.y] + map[nx][ny];
                        pq.offer(new Node(nx, ny, dist[nx][ny]));
                    }
                }
            }
        }
        return 0;
    }

    // 위치와 부순 벽의 개수를 저장할 클래스
    static class Node implements Comparable<Node> {
        int x, y, cost;

        Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost; // 비용 기준 오름차순 정렬
        }
    }
}