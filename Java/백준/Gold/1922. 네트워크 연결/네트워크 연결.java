import java.io.*;
import java.util.*;
public class Main {
    static int n,m,a,b,c;
    static int root[];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        root = new int[n+1];
        for(int i=0;i<n+1;i++){
            root[i] = i;
        }

        list = new ArrayList<>();

        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            list.add(new Edge(a,b,c));

        }

        Collections.sort(list);

        int total = 0;
        int cnt = 0;
        for(Edge e:list){
            if(find(e.a)!=find(e.b)){
                union(e.a,e.b);
                total+=e.c;
                cnt++;

                if(cnt==n-1){
                    break;
                }
            }
        }
        System.out.println(total);


    }
    static void union(int a,int b){
        a = root[a];
        b = root[b];

        if(a!=b){
            root[a] =b;
        }
    }
    static int find(int x){
        if(x==root[x]){
            return x;
        }
        return root[x] = find(root[x]);
    }
    static ArrayList<Edge>list;

    static class Edge implements Comparable<Edge>{
        int a,b,c;

        public Edge(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public int compareTo(Edge o) {
            return this.c - o.c;
        }
    }
}
