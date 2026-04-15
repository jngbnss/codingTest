import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int n, d, c, t, a, b, s;
    static int dist[];
    static ArrayList<Node> list[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); //컴퓨터 개수
            d = Integer.parseInt(st.nextToken()); //의존성 개수
            c = Integer.parseInt(st.nextToken()); // 해킹당한 컴퓨터의 번호
            list = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                list[i] = new ArrayList<>();
            }

            for (int i = 0; i < d; i++) {
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                s = Integer.parseInt(st.nextToken());
//                list[a].add(new Node(b, s));
                list[b].add(new Node(a, s));
            }

            dist = new int[n + 1];
            Arrays.fill(dist, Integer.MAX_VALUE);
            go(c);
            int ret = 0;
            int cnt = 0;
            for (int i = 1; i <= n; i++) {

                if (dist[i] != Integer.MAX_VALUE) {
                    ret = Math.max(ret, dist[i]);
                    cnt++;
                }
            }
            System.out.println(cnt + " " + ret);

        }

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
                int next = node.to;
                int cost1 = node.cost;
                int nextCost = cost1 + dist[now];
                if (nextCost < dist[next]) {
                    dist[next] = nextCost;
                    pq.offer(new Node(next, nextCost));
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
