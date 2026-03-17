import java.io.*;
import java.util.*;
public class Main {
    static final int mx = 1000004;
    static int n,m;
    static ArrayList<Integer>list;
    static boolean arr[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new boolean[mx];
        list = new ArrayList<>();
        go(2);
        for(int i=0;i<list.size();i++){
            if(list.get(i)<n){
                continue;
            }
            System.out.println(list.get(i));
        }
    }
    static void go(int x){
        if(x>m){
            return;
        }
        if(!arr[x]){
            arr[x] = true;
            list.add(x);
            for(int i=x;i<=m;i+=x){
                arr[i] = true;
            }
        }
        go(x+1);

    }
}
//에라토스테네스의 체