import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        // m개를 했을때 최대거리

        int low = 1;
        int high = arr[n-1]-arr[0];
        int ret = 0;

        while(low<=high){
            int mid  = (low+high)/2;

            if(go(arr,mid,m)){
                ret = mid;
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        System.out.println(ret);
    }
    static boolean go(int[] arr,int dist,int count){
        int cnt = 1;
        int last = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                cnt++;
                last = arr[i];
            }
        }
        return cnt>=count;
    }
}
