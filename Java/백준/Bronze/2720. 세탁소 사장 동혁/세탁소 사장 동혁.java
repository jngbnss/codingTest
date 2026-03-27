import java.io.*;
import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int input = Integer.parseInt(br.readLine());
            sb.append(input/25).append(" ");
            input%=25;
            sb.append(input/10).append(" ");
            input%=10;
            sb.append(input/5).append(" ");
            input%=5;
            sb.append(input/1).append("\n");



        }
        System.out.println(sb.toString());
        //StringTokenizer st = new StringTokenizer(br.readLine());
    }
}
