import java.io.*;
import java.util.*;
public class Main {
    static int n,m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       n = Integer.parseInt(st.nextToken());
       m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n + 1];
        ArrayList<Integer>[] list = new ArrayList[n + 1];
        for(int i=0;i<n+1;i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            int[] temp = new int[cnt];
            for(int j=0;j<cnt;j++){
                int tempInput = Integer.parseInt(st.nextToken());
                temp[j] = tempInput;

            }
            for(int j=0;j<cnt-1;j++){
                arr[ temp[j+1] ]++;
                list[ temp[j] ].add( temp[j+1] );
            }
        }
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            if(arr[i]==0){
                q.offer(i);
            }
        }
        int cnt =0;
        while(!q.isEmpty()){
            Integer poll = q.poll();
            sb.append(poll).append("\n");
            cnt++;
            for(Integer next:list[poll]){
                arr[next]--;
                if(arr[next]==0){
                    q.offer(next);
                }
            }
        }
        if(cnt==n){
            System.out.println(sb.toString());
        }else{
            System.out.println(0);
        }
        
    }
}

