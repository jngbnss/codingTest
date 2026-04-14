import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k, x;
    static long dist[];
    static int end;
    static final long INF = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 정점의 개수 n
        m = Integer.parseInt(st.nextToken()); // 간선의 수

        list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b, c));
            list[b].add(new Node(a, c));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        dist = new long[n + 1];
        Arrays.fill(dist, INF);
        go(start);
        System.out.println(dist[end]);

    }

    static void go(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.offer(new Node(start, 0));
        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            int now = poll.to;
            long cost = poll.cost;
            if (cost != dist[now]) {
                continue;
            }
            if (now == end) {
                break;
            }
            for (Node node : list[now]) {
                int next = node.to;
                long nextCost = node.cost + dist[now];
                if (nextCost < dist[next]) {
                    dist[next] = nextCost;
                    pq.offer(new Node(next, nextCost));
                }
            }
        }

    }

    static ArrayList<Node> list[];

    static class Node implements Comparable<Node> {
        int to;
        long cost;

        public Node(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Long.compare(this.cost, o.cost);
        }
    }
}
