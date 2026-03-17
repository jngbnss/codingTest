import java.io.*;
import java.sql.Array;
import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new node(x,y));
        }
        Collections.sort(list);
        for(int i=0;i<n;i++){
            System.out.println(list.get(i).x+" "+list.get(i).y);
        }

    }
    static ArrayList<node>list;
    static class node implements Comparable<node>{
        int x;
        int y;

        public node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(node o) {
            if(this.x==o.x){
                return this.y-o.y;
            }
            return this.x-o.x;
        }
    }
}
