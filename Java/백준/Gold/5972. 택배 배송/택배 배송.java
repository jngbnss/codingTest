import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k, x;

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

    static ArrayList<Node> list[];
    static int dist[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        list = new ArrayList[n + 1];
        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[from].add(new Node(to, cost));
            list[to].add(new Node(from, cost));

        }

        go(1, 0);
        System.out.println(dist[n]);
    }

    static void go(int from, int cost) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(from, cost));
        dist[from] = cost;
        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            int now = poll.to;
            int nowCost = poll.cost;
            if (nowCost != dist[now]) {
                continue;
            }
            if (now == n) {
                break;
            }
            for (Node nextNode : list[now]) {
                int nextCost = nextNode.cost + dist[now];
                if (nextCost < dist[nextNode.to]) {
                    dist[nextNode.to] = nextCost;
                    pq.offer(new Node(nextNode.to, nextCost));
                }
            }
        }
    }
}
