import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k, x;
    static int arr[], visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        if (n == k) {
            System.out.println(0);
        } else {
            arr = new int[200004];
            visited = new int[200014];
            go(n);
            System.out.println(visited[k] - 1);
        }
    }

    static void go(int n) {
        visited[n] = 1;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(n);
        while (!q.isEmpty()) {
            Integer now = q.poll();

            int next = now * 2;
            if (next <= 200004 && visited[next] == 0) {
                visited[next] = visited[now];
                q.offer(next);
            }
            int[] nextArr = {now - 1, now + 1};
            for (int next1 : nextArr) {
                if (next1 >= 0 && next1 <= 200004 && visited[next1] == 0) {
                    visited[next1] = visited[now] + 1;
                    q.offer(next1);
                }
            }
        }
    }
}
