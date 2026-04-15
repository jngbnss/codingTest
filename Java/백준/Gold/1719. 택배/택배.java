import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static String[][] arr;
    static int[] dist;

    static class Node implements Comparable<Node> {
        int to;
        int cost;

        public Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    static ArrayList<Node>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new String[n + 1][n + 1];
        list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            // 무방향 그래프이므로 양쪽으로 추가
            list[from].add(new Node(to, cost));
            list[to].add(new Node(from, cost));
        }

        // 각 노드 i를 시작점으로 하여 다익스트라를 한 번씩만 수행합니다.
        for (int i = 1; i <= n; i++) {
            go(i);
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    static void go(int start) {
        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        // 해당 시작점에서 각 목적지까지의 '첫 번째 경유지'를 저장할 배열
        int[] firstStep = new int[n + 1];
        
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            int now = poll.to;
            int cost = poll.cost;

            if (cost > dist[now]) continue;

            for (Node node : list[now]) {
                int next = node.to;
                int nextCost = dist[now] + node.cost;

                if (nextCost < dist[next]) {
                    dist[next] = nextCost;

                    // [핵심 로직]
                    // 만약 현재 노드가 시작점이라면, 다음 노드(next)가 바로 첫 번째 경유지입니다.
                    if (now == start) {
                        firstStep[next] = next;
                    } else {
                        // 시작점이 아니라면, 현재 노드(now)가 가지고 있던 첫 번째 경유지를 그대로 물려받습니다.
                        firstStep[next] = firstStep[now];
                    }
                    
                    pq.offer(new Node(next, nextCost));
                }
            }
        }

        // 다익스트라가 완료된 후, 결과 배열(arr)의 start 행을 채웁니다.
        for (int j = 1; j <= n; j++) {
            if (start == j) {
                arr[start][j] = "-";
            } else {
                arr[start][j] = String.valueOf(firstStep[j]);
            }
        }
    }
}