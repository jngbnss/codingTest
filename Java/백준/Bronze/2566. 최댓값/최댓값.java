import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        int[][] arr = new int[9][9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<9;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int ret = -1;
        int a =0,b=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                ret =Math.max(ret,arr[i][j]);
                if(ret==arr[i][j]){
                    a=i;b=j;
                }
            }
        }
        a++;
        b++;
        System.out.println(ret);
        System.out.println(a+" "+b);
    }
}