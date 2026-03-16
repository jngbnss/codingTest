import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n = 6;
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int input = Integer.parseInt(st.nextToken());
            arr[i] = input;
        }
        st = new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int ret =0;
        for(int i=0;i<n;i++){
            ret+=arr[i]/a;
            if(a*(arr[i]/a)<arr[i]){
                if(arr[i%a]!=0) ret++;
            }
        }
        System.out.println(ret);
        System.out.println((t/b)+" "+t%b);


    }
}
