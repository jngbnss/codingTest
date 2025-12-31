//package d1231.b2.q13300;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[7][3];
        for(int i=0;i<n;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st1.nextToken());
            int grade = Integer.parseInt(st1.nextToken());
            arr[grade][gender]++;
        }
        int ret =0;
        for(int i=1;i<7;i++){
            for(int j=0;j<2;j++){
                ret+=arr[i][j]/k;
                if(arr[i][j]%k!=0) ret++;
            }
        }
        System.out.println(ret);
    }
}
