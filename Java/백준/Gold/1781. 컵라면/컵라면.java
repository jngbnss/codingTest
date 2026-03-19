import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ret = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int pay = Integer.parseInt(st.nextToken());
            list.add(new int[]{day,pay});

        }
        Collections.sort(list,(a,b)->a[0]-b[0]);

        for(int i=0;i<n;i++){
            int[] arr = list.get(i);
            int day = arr[0];
            int pay = arr[1];
            pq.offer(pay);
            if(day<pq.size()){
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
            ret += pq.poll();
        }
        System.out.println(ret);


    }
}

