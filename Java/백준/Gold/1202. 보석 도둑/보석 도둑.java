import java.io.*;
import java.util.*;

public class Main {

    static int n, k;
    static Integer bag[];
    static gold[] arr;

    static class gold implements Comparable<gold> {
        int weight;
        int cost;

        public gold(int weight, int cost) {
            this.weight = weight;
            this.cost = cost;
        }

        @Override
        public int compareTo(gold o) {
            return this.weight - o.weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
//        PriorityQueue<gold> pq = new PriorityQueue<>();
        arr = new gold[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[i] = new gold(m, v);
//            pq.offer(new gold(m, v));
        }
        Arrays.sort(arr);

        bag = new Integer[k];
        for (int i = 0; i < k; i++) {
            int c = Integer.parseInt(br.readLine());
            bag[i] = c;
        }
        Arrays.sort(bag);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long ret = 0;
        int idx = 0; // 보석 인덱스
        for (int i = 0; i < k; i++) {
            while (idx < n && arr[idx].weight <= bag[i]) {
                pq.offer(arr[idx].cost);
                idx++;
            }
            if (!pq.isEmpty()) {
                ret += pq.poll();
            }
        }
        System.out.println(ret);
    }
}
