import java.io.*;
import java.util.*;
public class Main {
    static int n;
    static int arr[][];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        root = new int[n+1];
        for(int i=0;i<n+1;i++){
            root[i] = i;
        }
        list = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list.add(new Edge(i,j,arr[i][j]));
            }
        }
        Collections.sort(list);
        int cnt = 0;
        long ret =0;
        for(int i=0;i<list.size();i++){
            Edge edge = list.get(i);
            int from = edge.from;
            int to = edge.to;
            int w = edge.w;
            if(from==to) continue;
            if(find(from)!=find(to)){
                cnt++;
                union(from,to);
                ret+=w;
            }
            if(cnt==n-1){
                break;
            }
        }
        System.out.println(ret);

    }
    static ArrayList<Edge>list;
    static class Edge implements Comparable<Edge>{
        int from;
        int to;
        int w;

        public Edge(int from, int to, int w) {
            this.from = from;
            this.to = to;
            this.w = w;
        }

        @Override
        public int compareTo(Edge o) {
            return this.w-o.w;
        }
    }
    static int[]root;
    static void union(int a,int b){
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
