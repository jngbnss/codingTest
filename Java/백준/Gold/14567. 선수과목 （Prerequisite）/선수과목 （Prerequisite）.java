import java.io.*;
import java.util.*;

public class Main {
    static int n, m, a, b;
    static int arr[], ret[];
    static ArrayList<Integer> list[];
    static ArrayDeque<Node> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        ret = new int[n + 1];
        // 0으로 초기화 된 상태 인덱스는 1번부터 n번까지 주의!!
        list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            arr[b]++;
        }
        q = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                q.offer(new Node(i, 1));
            }
        }
        int idx = 1;
        while (!q.isEmpty()) {
            Node poll = q.poll();
            ret[poll.number] = poll.idx;
            for (Integer i : list[poll.number]) {
                arr[i]--;
                if (arr[i] == 0) {
                    q.offer(new Node(i, poll.idx + 1));
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(ret[i]).append(" ");
        }
        System.out.println(sb.toString());


    }

    static class Node {
        int number;
        int idx;

        public Node(int number, int idx) {
            this.number = number;
            this.idx = idx;
        }
    }
}
