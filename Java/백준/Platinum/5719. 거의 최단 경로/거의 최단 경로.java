import java.util.*;
import java.io.*;

public class Main {
    static final int INF = 1000000000;
    static int N, M, S, D;
    static List<Node>[] adj;
    static List<Integer>[] parent;
    static int[] dist;
    static boolean[][] isShortestEdge;

    static class Node implements Comparable<Node> {
        int to, weight;
        Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) break;

            st = new StringTokenizer(br.readLine());
            S = Integer.parseInt(st.nextToken());
            D = Integer.parseInt(st.nextToken());

            adj = new ArrayList[N];
            parent = new ArrayList[N];
            for (int i = 0; i < N; i++) {
                adj[i] = new ArrayList<>();
                parent[i] = new ArrayList<>();
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                adj[u].add(new Node(v, p));
            }

            isShortestEdge = new boolean[N][N];
            
            // 1. 최단 거리 탐색
            dijkstra();
            
            // 2. 최단 경로 간선들 제거 (BFS 역추적)
            removeShortestPath(D);
            
            // 3. 거의 최단 경로 탐색
            dijkstra();

            System.out.println(dist[D] == INF ? -1 : dist[D]);
        }
    }

    static void dijkstra() {
        dist = new int[N];
        Arrays.fill(dist, INF);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        
        dist[S] = 0;
        pq.add(new Node(S, 0));

        while (!pq.isEmpty()) {
            Node curr = pq.poll();

            if (curr.weight > dist[curr.to]) continue;

            for (Node next : adj[curr.to]) {
                // 이미 최단 경로로 판명되어 제거된 간선은 무시
                if (isShortestEdge[curr.to][next.to]) continue;

                if (dist[next.to] > dist[curr.to] + next.weight) {
                    dist[next.to] = dist[curr.to] + next.weight;
                    parent[next.to].clear();
                    parent[next.to].add(curr.to);
                    pq.add(new Node(next.to, dist[next.to]));
                } else if (dist[next.to] == dist[curr.to] + next.weight) {
                    // 거리가 같다면 경로가 여러 개인 것이므로 부모만 추가
                    parent[next.to].add(curr.to);
                }
            }
        }
    }

    static void removeShortestPath(int destination) {
        if (destination == S) return;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(destination);
        boolean[] visited = new boolean[N]; // 중복 방문 방지
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (visited[curr]) continue;
            visited[curr] = true;

            for (int p : parent[curr]) {
                isShortestEdge[p][curr] = true; // 간선 삭제 마킹
                q.add(p);
            }
        }
    }
}