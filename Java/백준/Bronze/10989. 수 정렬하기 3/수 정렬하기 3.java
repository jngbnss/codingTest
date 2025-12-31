//package sorting.q10989;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int [] cnt = new int[10001];

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            cnt[x]++;
        }
        for (int i = 0; i < 10001; i++) {
            while(cnt[i]-->0){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb.toString());

    }
}
