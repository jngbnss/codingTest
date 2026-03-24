import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int arr[];
    static ArrayList<Integer>[] list;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        list = new ArrayList[n + 1];
        sb = new StringBuilder();

        for (int i = 0; i < n + 1; i++) {

            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[b]++;
            list[a].add(b);

        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                pq.offer(i);
            }
        }

        while (!pq.isEmpty()) {
            Integer now = pq.poll();
            sb.append(now).append(" ");
            for(int next:list[now]){
                arr[next]--;
                if(arr[next]==0){
                    pq.offer(next);
                }
            }
        }
        // 3,1 이 4,2 보다 앞에 와야하거덩
        System.out.println(sb.toString());


    }

}

