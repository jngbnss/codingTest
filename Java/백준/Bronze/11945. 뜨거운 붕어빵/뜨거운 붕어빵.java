import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            String line = br.readLine();
            StringBuilder temp = new StringBuilder();
            StringBuilder append = temp.append(line).reverse().append("\n");
            sb.append(append);

        }
        System.out.println(sb.toString());


    }
}
