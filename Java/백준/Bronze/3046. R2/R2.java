import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int r2 = 0;
        if(r1<=s){
            r2 = s+(s-r1);
        }else{
            r2 = s-(r1-s);
        }
        System.out.println(r2);
    }
}