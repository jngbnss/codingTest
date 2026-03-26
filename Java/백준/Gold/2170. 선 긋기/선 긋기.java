import java.io.*;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            pq.offer(new int[]{a, b});
        }

        long cnt = 0;

        int start = Integer.MIN_VALUE;
        int end = Integer.MIN_VALUE;
//        int end = 0;
        while (!pq.isEmpty()) {
            int[] poll = pq.poll();
            int a = poll[0];
            int b = poll[1];

            if (end < a) { // 현재까지의 마지막 포인트가 다음 앞에보다 작으면
                // 한번 짤라야지
                cnt += end - start;

                start = a;
                end = b;

            }
            // 현재 포인트랑 같거나 그 안이면 그냥 포함
            // 하는게 없는데?
            else {
                // 새로운 시작이 end보다 작거나 같으면
                end = Math.max(end, b);
            }


        }
        cnt += end - start;
        System.out.println(cnt);
    }
}
