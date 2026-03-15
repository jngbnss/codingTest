import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
//        System.out.println(m/2);
        int half= 1+(m/2);
        int cnt = 0;
        for(int i=0;i<n;i++){
            String line = br.readLine();
            int temp =0;
            for(int j=0;j<line.length();j++){
                if(line.charAt(j)=='O'){
                    temp++;
                }
                if(temp>=half){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);

    }
}
