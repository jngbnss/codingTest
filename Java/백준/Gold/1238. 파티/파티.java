import java.io.*;
import java.util.*;

public class Main {
    static int n,m,x;
    static int dist[];
    static class Node implements Comparable<Node>{
        int to;
        int cost;

        public Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost-o.cost;
        }
    }
    static ArrayList<Node>list[];
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        // x로 가기
        //n명
        list = new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b,c));
        }

        int ret = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int temp = 0;
            if(i==x){
                continue;
            }
            dist = new int[n+1];
            Arrays.fill(dist,Integer.MAX_VALUE);
            dijk(i,x);
            temp+=dist[x];
            Arrays.fill(dist,Integer.MAX_VALUE);
            dijk(x,i);
            temp+=dist[i];

            ret = Math.max(ret,temp);
        }
        System.out.println(ret);
    }
    static void dijk(int start,int end){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0; //이거 빠트림
        pq.offer(new Node(start,0));
        while(!pq.isEmpty()){
            Node poll = pq.poll();
            int now = poll.to;
            int cost = poll.cost;
            if(dist[now]!=cost){
                continue;
            }
            for (Node node : list[now]) {
                int nextCost = cost+node.cost;
                if(nextCost<dist[node.to]){
                    dist[node.to] = nextCost;
                    pq.offer(new Node(node.to,nextCost));
                }
            }
        }

    }
}
