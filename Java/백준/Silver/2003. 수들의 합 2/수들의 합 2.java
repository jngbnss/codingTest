import java.io.*;
import java.util.*;
public class Main {
    static int n,m;
    static long ret;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int s = 0;
        int e = 0;
        int temp = 0;
        while(true){

            if(temp>=m){
                if(temp==m)
                    ret++;
                temp-=arr[s++];
            }else if(e==n){
                break;
            }else{
                temp+=arr[e++];
            }
        }
        System.out.println(ret);
    }
}
