import java.io.*;
import java.util.*;
public class Main {
    static int n,cnt;
    static int arr[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
         arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
             arr[i] = Integer.parseInt(st.nextToken());
             if(arr[i]==1) continue;
             boolean flag = true;
             for(int j=2;j<arr[i];j++){
                 if(arr[i]%j==0){
                     flag = false;
                     break;
                 }
             }
             if(flag) {
//                 System.out.println(arr[i]);
                 cnt++;
             }
         }
        System.out.println(cnt);

    }
}
