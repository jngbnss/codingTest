import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int v, e, a, b, c, ret;
    static int arr[], root[];
    static ArrayList<Node> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        arr = new int[v + 1];
        list = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            list.add(new Node(a, b, c));

        }
        Collections.sort(list);

        root = new int[v + 1];
        for (int i = 0; i <= v; i++) {
            root[i] = i;
        }
        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            Node node = list.get(i);
            int from = node.from;
            int to = node.to;
            int cost = node.cost;
            if (find(from) != find(to)) {
                cnt++;
                union(from, to);
                ret += cost;
            }
            if (cnt == v - 1) {
                break;
            }
        }
        System.out.println(ret);

        // 아무데서나 해도 상관없음
    }

    static int find(int x) {
        if (x == root[x]) {
            return x;
        }
        return root[x] = find(root[x]);
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            root[a] = b;

        }
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
