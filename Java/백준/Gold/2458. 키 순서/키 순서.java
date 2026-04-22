import java.io.*;
import java.util.*;

public class Main {
    static int n,m,ret;
    static int arr[],visited[],visited1[];
    static ArrayList<Integer>up[],down[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        up = new ArrayList[n+1];
        down = new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            up[i] = new ArrayList<>();
            down[i] = new ArrayList<>();
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // a에서 b로 올라만감
            up[a].add(b);
            down[b].add(a);
        }

        for(int i=1;i<=n;i++){
            visited = new int[n+1];
            visited1 = new int[n+1];
            if(n==Up(i)+Down(i)-1){
                ret++;
            }
        }
        System.out.println(ret);
    }
    static int Up(int idx){
        visited[idx] = 1;
        int temp = 1;
        for (int i : up[idx]) {
            if(visited[i]==0){
                temp+=Up(i);
            }
        }
        return temp;

    }
    static int Down(int idx){
        visited1[idx] = 1;
        int temp = 1;
        for (int i : down[idx]) {
            if(visited1[i]==0){
                temp+=Down(i);
            }
        }
        return temp;

    }
}
