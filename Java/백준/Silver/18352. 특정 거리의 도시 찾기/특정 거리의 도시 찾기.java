import java.io.*;
import java.util.*;

public class Main {
    static int n,m,k,x;
    static int arr[],dist[],visited[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        list = new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // a에서 b로 가는 녀석이니까
            list[a].add(b);

        }
        dijk(x,0);
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            if(dist[i]==k){
                sb.append(i).append("\n");
            }
        }
        String string = sb.toString();
        for (int i : dist) {
//            System.out.println(i);
        }
        if(string.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(string);
        }
    }
    static void dijk(int x,int cost){
        dist[x] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(x,cost));

        while(!pq.isEmpty()){
            Node now = pq.poll();
            int nowTo = now.to;
            int nowCost = now.cost;
            if(dist[nowTo]!=nowCost){
                continue;
            }
            for(Integer next:list[nowTo]){
                int nextCost = nowCost+1;
                if(nextCost<dist[next]){
                    dist[next] = nextCost;
                    pq.offer(new Node(next,nextCost));
                }
            }
        }
    }
    static ArrayList<Integer>[]list;
    static class Node implements Comparable<Node>{
        int to;
        int cost;

        public Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost- o.cost;
        }
    }
}
