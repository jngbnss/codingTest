import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static ArrayList<Node> list[];
    static int[] dist;
    static int start, end;

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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        list = new ArrayList[n + 1];
        dist = new int[n + 1];

        for (int i = 0; i < n+1; i++) {
            list[i] = new ArrayList<>();
            dist[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            list[from].add(new Node(to, cost));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        go();
        System.out.println(dist[end]);
    }

    static void go() {
        dist[start] = 0; //
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            int now = poll.to;
            int cost = poll.cost;

            if (cost != dist[now]) {
                continue;
            }

            if (now == end) {
                return;
            }

            for (Node node : list[now]) {
                int next = node.to;
                int nextCost = node.cost+dist[now];

                if (nextCost < dist[next]) {
                    dist[next] = nextCost;
                    pq.offer(new Node(next, nextCost));
                }
            }
        }
    }
}
