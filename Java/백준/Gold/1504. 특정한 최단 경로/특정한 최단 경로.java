import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int n, e, a, b, c, v1, v2;
    static int[] dist;
    static int[] dist1;
    static int[] dist2;
    static ArrayList<Node>[] list;
    static final int  INF= 200_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        list = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }
        dist = new int[n + 1];
        dist1 = new int[n + 1];
        dist2 = new int[n + 1];
        Arrays.fill(dist,INF);
        Arrays.fill(dist1, INF);
        Arrays.fill(dist2,INF);

        // 1번에서 n번으로 가는데 반드시 v1,v2를 거쳐야함
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b, c));
            list[b].add(new Node(a, c));
        }
        st = new StringTokenizer(br.readLine());
        v1 = Integer.parseInt(st.nextToken());
        v2 = Integer.parseInt(st.nextToken());
        // 그냥 다 더하면 되는건가?
        dijk(1,dist);
        dijk(v1,dist1);
        dijk(v2,dist2);

        int ret1 = dist[v1] + dist1[v2] + dist2[n];
        int ret2 = dist[v2] + dist2[v1] + dist1[n];
        int ret = Math.min(ret1, ret2);
        if (ret >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(ret);
        }
    }
    static void dijk(int start,int []dist){
        dist[start] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));

        while(!pq.isEmpty()){
            Node poll = pq.poll();
            int now = poll.to;
            int cost = poll.cost;
            if(cost!=dist[now]){
                continue;
            }
            for(Node node:list[now]){
                int next = node.to;
                int nextCost = node.cost+dist[now];
                if(nextCost<dist[next]){
                    dist[next] = nextCost;
                    //pq.offer(node);
                    pq.offer(new Node(next,nextCost));
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
