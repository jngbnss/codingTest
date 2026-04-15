import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int v, e, p, a, b, c;
    static int dist[];
    static ArrayList<Node> list[];
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        dist = new int[v + 1];
        Arrays.fill(dist, INF);
        list = new ArrayList[v + 1];
        for (int i = 0; i <= v; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b, c));
            list[b].add(new Node(a, c));
        }
        //1에서 v로 가는 중에 p가 최단 거리면 yes인데 어떻게 알수있지?
        //1에서 v가는거랑
        //1에서 p더하기 p에서v가는게 같으면 되나?
        go(1);
        int ret1 = dist[v];//1에서v가기
        int ret2 = dist[p];//1에서 p가기
        Arrays.fill(dist, INF);
        go(p);
        ret2 += dist[v];
//        System.out.println(ret1);
//        System.out.println(ret2);

        if (ret1 == ret2) {
            System.out.println("SAVE HIM");
        } else {
            System.out.println("GOOD BYE");
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
            return Integer.compare(this.cost, o.cost);
        }
    }
}
