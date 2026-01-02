//package bruteforcingB5.q2501;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ret = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            if(n%i==0){
                list.add(i);
            }

        }
        if(list.size()<k){
            System.out.println(0);
            return;
        }
        else if(list.size()>=k-1){
                System.out.println(list.get(k-1));
        }
    }
}
