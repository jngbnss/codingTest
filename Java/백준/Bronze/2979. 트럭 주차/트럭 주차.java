//package d260101.q2979;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[104];
        for(int i=0;i<3;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int j = start; j <end ; j++) {
                arr[j]++;
            }
        }
        int ret = 0;
        for (int i = 0; i < 101; i++) {
            if(arr[i]==1){
                ret+=a;
            }else if(arr[i]==2){
                ret+=2*b;
            }else if(arr[i]==3){
                ret+=3*c;
            }
        }
        System.out.println(ret);

    }
}
