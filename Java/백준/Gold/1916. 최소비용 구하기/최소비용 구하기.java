import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k, x, start, end;
    static int dist[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
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
        //1에서 다익스트라 진행해서 end비용 말하기
        dijk(start);
        System.out.println(dist[end]);
    }

    static void dijk(int start) {
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
//        pq.offer(list[start].get(0));
        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            int now = poll.to;
            int cost = poll.cost;

            if (cost != dist[now]) {
                continue;
            }
            for (Node next : list[now]) {
                int nextCost = next.cost + dist[now];
                if (nextCost < dist[next.to]) {
                    dist[next.to] = nextCost;
                    pq.offer(new Node(next.to, nextCost));
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

