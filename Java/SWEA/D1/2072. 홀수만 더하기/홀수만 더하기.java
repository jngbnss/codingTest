
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int idx = 0;
        while(t-->0){
            idx++;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ret =0;
            for (int i = 0; i < 10; i++) {
                int a = Integer.parseInt(st.nextToken());
                if(a%2!=0){
                    ret+=a;
                }
            }
            System.out.println("#"+idx+" "+ret);

        }

    }
}