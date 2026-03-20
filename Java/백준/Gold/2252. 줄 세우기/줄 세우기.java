import java.io.*;
import java.util.*;
public class Main {
    static  ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];// 붙어있는거 0개
        list = new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            list[i] = new ArrayList<>();
        }


        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            arr[b]++;

        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            if(arr[i]==0){
                pq.offer(i);
            }

        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Integer poll = pq.poll();
            sb.append(poll+" ");
            for(int i:list[poll]){
                arr[i]--;
                if(arr[i]==0){
                    pq.offer(i);
                }
            }
        }
        System.out.println(sb.toString());

    }
}
