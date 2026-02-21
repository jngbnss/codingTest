import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static boolean[] visited;
    static ArrayList<Integer>list;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];

        list = new ArrayList<Integer>();
        go(1,0);
        System.out.println(sb.toString());

    }
    static void go(int now,int idx){
        if(idx==m){
            for(int i:list){
                sb.append(i).append(" ");

            }sb.append('\n');
            return;
        }
        for(int i=1;i<=n;i++){
                list.add(i);
                go(i,idx+1);
                list.remove(list.size()-1);

        }
    }
}
