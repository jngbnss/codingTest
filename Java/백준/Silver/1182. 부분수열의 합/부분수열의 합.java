import java.io.*;
import java.util.*;
public class Main {
    static int n,s,ret;
    static int arr[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         s = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());


        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());

        }

        go(0,0); // 인덱스랑 합
        if(s==0){
            ret--;
        }
        System.out.println(ret);
    }
    static void go(int idx,int temp){
        if(idx==n){
            if(temp==s){
                ret++;
            }
            return;
        }
        go(idx+1,temp+arr[idx]);
        go(idx+1,temp);
    }
}

