import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    static int n, m;
    static final int MAX = 2000004;
    static int arr[], cnt[];
    static int visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[MAX];
        visited = new int[MAX];
        cnt = new int[MAX];
        if (n == m) {
            System.out.println(0 + "\n" + 1);

        } else {
            visited[n] = 1;
            cnt[n] = 1;
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.offer(n);
            while (!q.isEmpty()) {
                int now = q.poll();
                for (int next : new int[]{now - 1, now + 1, 2 * now}) {
                    if (next < 0 || next >= MAX) {
                        continue;
                    }
                    if (visited[next] == 0) {
                        visited[next] = visited[now] + 1;
                        cnt[next] = cnt[now];
                        q.offer(next);
                    } else if (visited[next] == visited[now] + 1) {
                        cnt[next] += cnt[now];
//                        q.offer(next);
                    }
                }
            }
            System.out.println(visited[m] - 1);
            System.out.println(cnt[m]);

        }
    }
}
