import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int arr[];
    // INF 값은 간선 가중치 최대(10만) * 정점 최대(10만)인 100억보다 커야 합니다.
    static final long INF = Long.MAX_VALUE; 

    static class Node implements Comparable<Node> {
        int to;
        long cost;

        public Node(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            // ERROR 1: long 값끼리 뺄셈으로 비교하면 overflow 위험이 있습니다.
            // Long.compare를 사용하는 것이 가장 안전합니다.
            return Long.compare(this.cost, o.cost);
        }
    }

    static ArrayList<Node> list[];
    static long dist[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        list = new ArrayList[n];
        dist = new long[n];
        // ERROR 2: Integer.MAX_VALUE는 약 21억으로, 100억이 넘을 수 있는 이 문제에선 부족합니다.
        Arrays.fill(dist, INF); 
        
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[from].add(new Node(to, cost));
            list[to].add(new Node(from, cost));
        }

        go(0, 0);

        // ERROR 3: 출력 시 비교하는 INF 값도 Long 기준이어야 합니다.
        if (dist[n - 1] == INF) {
            System.out.println(-1);
        } else {
            System.out.println(dist[n - 1]);
        }
    }

    static void go(int from, long cost) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(from, cost));
        dist[from] = cost;

        while (!pq.isEmpty()) {
            Node poll = pq.poll();
            int now = poll.to;
            long nowCost = poll.cost; // ERROR 4: 변수 타입 long으로 일치

            if (nowCost > dist[now]) {
                continue;
            }
            
            // n-1 도달 시 이미 최단거리가 확정된 상태이므로 여기서 끊어줘도 무방합니다.
            if (now == n - 1) break; 

            for (Node nextNode : list[now]) {
                int next = nextNode.to;
                
                // 시야에 걸리는 곳(1)은 못 가지만, 넥서스(n-1)는 예외
                if (arr[next] == 1 && next != n - 1) {
                    continue;
                }

                long nextCost = nextNode.cost + dist[now];
                if (nextCost < dist[nextNode.to]) {
                    dist[nextNode.to] = nextCost;
                    pq.offer(new Node(nextNode.to, nextCost));
                }
            }
        }
    }
}