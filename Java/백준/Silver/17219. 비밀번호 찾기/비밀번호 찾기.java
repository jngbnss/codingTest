import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String line =st.nextToken();
            String line1 = st.nextToken();
            map.put(line,line1);
        }
        for(int i=0;i<m;i++){
            String line = br.readLine();
            System.out.println(map.get(line));
        }
    }
}
