import java.io.*;
import java.util.*;
public class Main {
    static int n,m,ret;
    static class Node implements Comparable<Node>{
        int from;
        int to;
        int w;

        public Node(int from, int to, int w) {
            this.from = from;
            this.to = to;
            this.w = w;
        }

        @Override
        public int compareTo(Node o) {
            return this.w-o.w;
        }
    }
    static ArrayList<Node>list;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ret =0 ;
        list = new ArrayList<>();
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list.add(new Node(a,b,c));

        }
        Collections.sort(list);

        root = new int[n+1];
        for(int i=0;i<=n;i++){
            root[i] = i;
        }

        int cnt = 0;
        for(int i=0;i<list.size();i++){
            
            Node node = list.get(i);
            int from = node.from;
            int to = node.to;
            int w = node.w;
            if(find(from)!=find(to)){
                cnt++;
                uion(from,to);
                ret+=w;
            }
            if(cnt==n-1){
                break;
            }
        }
        System.out.println(ret);
    }
    static int root[];
    static void uion(int a,int b){
        a = find(a);
        b = find(b);
        if(a!=b){
            root[a] = b;
        }
    }
    static int find(int x){
        if(x==root[x]){
            return x;
        }
        return root[x] = find(root[x]);

    }
}
