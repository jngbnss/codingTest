import java.io.*;
import java.util.*;
public class Main {
    static int n,m;
    static int root[];
    static class Node implements Comparable<Node>{
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
            return this.cost-o.cost;
        }
    }
    static ArrayList<Node>list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        root = new int[n+1];
        for(int i=0;i<=n;i++){
            root[i] = i;
        }

        list = new ArrayList<>();
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list.add(new Node(a,b,c));
            //list.add(new Node(b,a,c));
        }

        Collections.sort(list);
        int cnt =0;
        long ret =0;
        for(int i=0;i<list.size();i++){
            Node node = list.get(i);
            int from = node.from;
            int to = node.to;
            int cost = node.cost;
            if(find(from)!=find(to)){
                union(from,to);
                cnt++;
                ret+=cost;
            }
            if(cnt==n-2){
                break;
            }
        }
//        System.out.println(ret);
        System.out.println(n==2?0:ret);
    }
    static int find(int x){
        if(x==root[x]){
            return x;
        }
        return root[x] = find(root[x]);
    }
    static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b){
            root[a] = b;
        }
    }
}
