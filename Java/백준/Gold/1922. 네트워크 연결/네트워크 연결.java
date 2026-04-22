import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int a, b, c;
    static int root[];
    static int ret;
    static ArrayList<Node> list;

    static int find(int x) {
        if (x == root[x]) {
            return x;
        }
        return root[x] = find(root[x]);
    }

    static void union(int a, int b) {
        a = root[a];
        b = root[b];
        if (a != b) {
            root[a] = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        root = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            root[i] = i;
        }
        list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            list.add(new Node(a, b, c));

        }
        Collections.sort(list);

        int cnt = 0;

        for (int i = 0; i < list.size(); i++) {
            Node node = list.get(i);
            int from = node.from;
            int to = node.to;
            int cost = node.cost;
            if (find(from) != find(to)) {
                union(from, to);
                cnt++;
                ret += cost;

            }
            if (cnt == n - 1) {
                break;
            }
        }
        System.out.println(ret);


    }

    static class Node implements Comparable<Node> {
        int from;
        int to;
        int cost;

        public Node(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
}
