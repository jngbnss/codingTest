import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k, x, a, b;
    static int visited[], dist[];
    static ArrayList<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 도시의 개수
        n = Integer.parseInt(st.nextToken());
        //도로의 개수
        m = Integer.parseInt(st.nextToken());
        //거리 정보 최단거리
        k = Integer.parseInt(st.nextToken());
        //출발 도시의 번호
        x = Integer.parseInt(st.nextToken());
        list = new ArrayList[n + 1];
        dist = new int[n + 1];
        visited = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
            dist[i] = Integer.MAX_VALUE;

        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            list[a].add(b);
        }

        dijk(x);

//        for(int i=1;i<=n;i++){
//            System.out.print(dist[i]+" ");
//        }
//        System.out.println();

        boolean flag = false;
        for (int i = 0; i <= n; i++) {
            if (dist[i] == k) {
                flag = true;
                sb.append(i).append("\n");
            }
        }
        if(flag) {
            System.out.println(sb.toString());
        }else{
            System.out.println(-1);
        }
    }

    static void dijk(int x) {
        dist[x] = 0;
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayDeque<Integer> pq = new ArrayDeque<>();
        pq.offer(x);
        int idx = 1;
        visited[x] = idx++;


        while (!pq.isEmpty()) {
            Integer now = pq.poll();
            if(dist[now]>k) continue;

            for (Integer i : list[now]) {
                if(dist[i]==Integer.MAX_VALUE){
//                    visited[i] = 1;
                    dist[i] = dist[now]+1;
                    pq.offer(i);
                }

            }
        }
    }
}
