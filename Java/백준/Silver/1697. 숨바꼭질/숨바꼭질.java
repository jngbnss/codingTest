//package q1697;

import java.io.*;
import java.util.*;

public class Main {
    static int MX = 100004*2;
    static int visited[];
    static int arr[];
    static Deque<Integer> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new int[MX];
        arr = new int[MX];

        int result = 0;
        if (n == 0 && m == 0) {
            System.out.println(0);
            return;
        }

        bfs(n);
        System.out.println(visited[m]-1);
    }

    static void bfs(int now) {
        visited[now] = 1;
        q.add(now);
        while (q.size() != 0) {
            now = q.poll();
            int arrNext[] = {now - 1, now + 1, now * 2};
            for (int next : arrNext) {
                {
                    if (next < 0 || next >= MX) {
                        continue;
                    }
                    if(visited[next]==0){
                        visited[next] = visited[now] + 1;
                        q.add(next);
                        }
                }
            }
        }
    }
}