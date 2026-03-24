import java.io.*;
import java.util.*;

public class Main {
    // 행성의 정보를 담을 클래스 (id를 반드시 포함해야 함)
    static class Planet {
        int id, x, y, z;
        public Planet(int id, int x, int y, int z) {
            this.id = id;
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static class Node implements Comparable<Node> {
        int from, to, cost;
        public Node(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static int[] root;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Planet[] planets = new Planet[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            // i+1을 id로 저장해서 원래 번호를 기억함
            planets[i] = new Planet(i + 1, x, y, z);
        }

        ArrayList<Node> edgeList = new ArrayList<>();

        // 1. X축 기준으로 정렬하고 인접한 것들끼리 간선 생성
        Arrays.sort(planets, (p1, p2) -> p1.x - p2.x);
        for (int i = 0; i < n - 1; i++) {
            edgeList.add(new Node(planets[i].id, planets[i + 1].id, Math.abs(planets[i].x - planets[i + 1].x)));
        }

        // 2. Y축 기준으로 정렬하고 인접한 것들끼리 간선 생성
        Arrays.sort(planets, (p1, p2) -> p1.y - p2.y);
        for (int i = 0; i < n - 1; i++) {
            edgeList.add(new Node(planets[i].id, planets[i + 1].id, Math.abs(planets[i].y - planets[i + 1].y)));
        }

        // 3. Z축 기준으로 정렬하고 인접한 것들끼리 간선 생성
        Arrays.sort(planets, (p1, p2) -> p1.z - p2.z);
        for (int i = 0; i < n - 1; i++) {
            edgeList.add(new Node(planets[i].id, planets[i + 1].id, Math.abs(planets[i].z - planets[i + 1].z)));
        }

        // 모든 간선을 거리순으로 정렬
        Collections.sort(edgeList);

        // Union-Find 초기화
        root = new int[n + 1];
        for (int i = 1; i <= n; i++) root[i] = i;

        long totalCost = 0;
        for (Node edge : edgeList) {
            if (find(edge.from) != find(edge.to)) {
                union(edge.from, edge.to);
                totalCost += edge.cost;
            }
        }
        System.out.println(totalCost);
    }

    static int find(int x) {
        if (x == root[x]) return x;
        return root[x] = find(root[x]);
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) root[a] = b;
    }
}