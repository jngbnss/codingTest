import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static final int INF = Integer.MAX_VALUE;
    static int n, m, x, a, b, c;
    static int dist[];
    static ArrayList<Node> list[];
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        dist = new int[n + 1];
        arr = new int[n + 1];
        Arrays.fill(dist, INF);
        list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b, c));
        }
        int ret = 0;

        for (int i = 1; i <= n; i++) {
            Arrays.fill(dist, INF);
            if (i == x) {
                continue;
            }
            go(i);
            arr[i] = dist[x];
        }
        Arrays.fill(dist, INF);
        go(x);
        for (int i = 1; i <= n; i++) {
            if (i == x) {
                continue;
            }
            arr[i] += dist[i];
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            ret = Math.max(ret, arr[i]);
            if (arr[i] == ret) {
                result = i;
            }
        }
        System.out.println(ret);
    }

    static void go(int i) {
        dist[i] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(i, 0));
        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            int now = poll.to;
            int cost = poll.cost;
            if (cost != dist[now]) {
                continue;
            }
            for (Node node : list[now]) {
                int nextCost = node.cost + cost;
                if (nextCost < dist[node.to]) {
                    dist[node.to] = nextCost;
                    pq.offer(new Node(node.to, nextCost));
                }
            }
        }
    }

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
