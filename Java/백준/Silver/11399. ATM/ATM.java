import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        int temp = 0;
        int ret =0;
        for(int i=0;i<n;i++){
            int now = list.get(i);
//            System.out.println(now);
            temp += now;
            ret += temp;

        }System.out.println(ret);
    }
}
