import java.io.*;
import java.util.*;
import org.omg.CORBA.INV_FLAG;

public class Main {
    static int V, E, K, u, v, w;
    static int dist[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        list = new ArrayList[V + 1];
        for (int i = 0; i < V + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            list[u].add(new Node(v, w));
        }
        dijk(K);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                sb.append("INF").append("\n");
            } else {
                sb.append(dist[i]).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    static void dijk(int start) {
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            int now = poll.to;
            int cost = poll.cost;
            if (cost != dist[now]) {
                continue;
            }
            for (Node node : list[now]) {
                int nextCost = dist[now] + node.cost;
                if (nextCost < dist[node.to]) {
                    dist[node.to] = nextCost;
                    pq.offer(new Node(node.to, nextCost));
                }
            }
        }
    }

    static ArrayList<Node> list[];

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
}
