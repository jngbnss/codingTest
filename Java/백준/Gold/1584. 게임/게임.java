import java.util.*;
import java.io.*;

public class Main {
    static int[][] map = new int[501][501];
    static int[][] dist = new int[501][501];
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 위험한 구역 설정 (1)
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            markMap(br.readLine(), 1);
        }

        // 2. 죽음의 구역 설정 (2) - 위험한 구역 위에 덮어씌움
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            markMap(br.readLine(), 2);
        }

        // 다익스트라 실행
        int result = dijkstra();
        System.out.println(result);
    }

    static void markMap(String line, int type) {
        StringTokenizer st = new StringTokenizer(line);
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        // 시작과 끝 좌표가 뒤집혀서 들어올 수 있으므로 정렬 필요
        int startX = Math.min(x1, x2);
        int endX = Math.max(x1, x2);
        int startY = Math.min(y1, y2);
        int endY = Math.max(y1, y2);

        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                map[i][j] = type;
            }
        }
    }

    static int dijkstra() {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int[] row : dist) Arrays.fill(row, INF);

        // 시작점 (0,0) 설정
        dist[0][0] = 0;
        pq.offer(new Node(0, 0, 0));

        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            // 현재 저장된 최소 생명력보다 크다면 탐색할 필요 없음
            if (curr.cost > dist[curr.x][curr.y]) continue;

            // 목적지 도착 시 즉시 반환
            if (curr.x == 500 && curr.y == 500) return curr.cost;

            for (int i = 0; i < 4; i++) {
                int nx = curr.x + dx[i];
                int ny = curr.y + dy[i];

                // 맵 범위 내에 있고 죽음의 구역(2)이 아닌 경우만 이동
                if (nx >= 0 && nx <= 500 && ny >= 0 && ny <= 500 && map[nx][ny] != 2) {
                    int nextCost = curr.cost + map[nx][ny]; // 위험한 구역(1)이면 +1, 안전(0)이면 +0
                    
                    if (nextCost < dist[nx][ny]) {
                        dist[nx][ny] = nextCost;
                        pq.offer(new Node(nx, ny, nextCost));
                    }
                }
            }
        }

        return -1; // 도달 불가능할 경우
    }

    static class Node implements Comparable<Node> {
        int x, y, cost;
        Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
}