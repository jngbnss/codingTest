import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static final int INF = Integer.MAX_VALUE;
    static int n, m;
    static int startNode, endNode; // 시작 공장과 끝 공장
    static int[] dist;
    static ArrayList<Node> list[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 섬의 개수
        m = Integer.parseInt(st.nextToken()); // 다리의 개수

        list = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        // 다리 정보 입력
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken()); // 중량 제한

            // 1939번은 양방향 통행이 가능합니다.
            list[a].add(new Node(b, c));
            list[b].add(new Node(a, c));
        }

        // 마지막 줄: 시작 공장과 끝 공장 번호
        st = new StringTokenizer(br.readLine());
        startNode = Integer.parseInt(st.nextToken());
        endNode = Integer.parseInt(st.nextToken());

        dist = new int[n + 1];
        // 최대 무게를 찾아야 하므로 초기값을 0(혹은 -1)으로 잡는 것이 로직 구성에 편합니다.
        Arrays.fill(dist, 0);

        // 여기에 go(startNode)를 구현하시면 됩니다.
        go(startNode);
        System.out.println(dist[endNode]);
    }

    static void go(int i) {
        dist[i] = Integer.MAX_VALUE;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(i, dist[i]));
        // 제일 잘 버틸수있는 다리부터 가보기
        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            int now = poll.to;
            int cost = poll.cost;
            if (cost != dist[now]) {
                continue;
            }
            for (Node node : list[now]) {
                int next = node.to;
                int limit = node.cost;
                int nextCost = Math.min(cost, limit);
                if (nextCost > dist[next]) {
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
            // 최대 중량 경로를 먼저 탐색하기 위해 내림차순 정렬 (Max Heap)
            return o.cost - this.cost;
        }
    }
}