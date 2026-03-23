import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        root = new int[n + 1];


        for (int i = 0; i <= n; i++) {
            root[i] = i;
        }

//        list = new ArrayList[n + 1];
//
//        visited = new int[n + 1];
//
//        for (int i = 0; i <= n; i++) {
//            list[i] = new ArrayList<>();
//        }



        //pq하면서 연결하고 다 방문하면 끝?
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
//            list[from].add(new Edge(from,to, w));
            pq.offer(new Edge(from,to,w));
            // 연결했다 치고
        }

//        pq.offer(new Edge(1, 0));
        int ret = 0;

        while (!pq.isEmpty()) {
            Edge poll = pq.poll();
            int from = poll.from;
            int to = poll.to;
            int w = poll.w;

            if(find(from)!=find(to)){
                union(from,to);
//                System.out.println(w);
                ret+=w;
            }

        }
        System.out.println(ret);
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            root[a] = b;
        }
    }

    static int root[];

    static int find(int x) {
        if (root[x] == x) {
            return x;
        } else {
            return  root[x] = find(root[x]);
        }
    }

    // 크루스칼은 유니온파인드인데
    static int visited[];
    static ArrayList<Edge> list[];

    static class Edge implements Comparable<Edge> {
        int from;
        int to;
        int w;

        public Edge(int from, int to, int w) {
            this.from = from;
            this.to = to;
            this.w = w;
        }

        @Override
        public int compareTo(Edge o) {
            return this.w - o.w;
        }
    }
}
