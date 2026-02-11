import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(st.nextToken());
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int x = Integer.parseInt(st.nextToken());
            if(map.get(x) == null){
                sb.append(0).append(" ");
            }
            else sb.append(map.get(x)).append(" ");

        }
        System.out.println(sb.toString());
    }
}
