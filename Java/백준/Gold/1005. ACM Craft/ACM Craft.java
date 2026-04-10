import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 건물 개수
            int K = Integer.parseInt(st.nextToken()); // 건설 순서 규칙 개수

            int[] buildTime = new int[N + 1]; // 각 건물 소요 시간
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                buildTime[i] = Integer.parseInt(st.nextToken());
            }

            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i <= N; i++) adj.add(new ArrayList<>());
            
            int[] indegree = new int[N + 1]; // 진입 차수 배열
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int v1 = Integer.parseInt(st.nextToken());
                int v2 = Integer.parseInt(st.nextToken());
                adj.get(v1).add(v2);
                indegree[v2]++;
            }

            int W = Integer.parseInt(br.readLine()); // 승리하기 위해 지어야 할 건물

            solve(N, buildTime, adj, indegree, W);
        }
    }

    static void solve(int N, int[] buildTime, List<List<Integer>> adj, int[] indegree, int W) {
        Queue<Integer> q = new LinkedList<>();
        int[] result = new int[N + 1]; // 해당 건물을 짓기까지 걸리는 총 시간

        // 초기 설정: 진입 차수가 0인 건물들을 큐에 넣고 소요 시간 초기화
        for (int i = 1; i <= N; i++) {
            result[i] = buildTime[i];
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int next : adj.get(curr)) {
                // 다음 건물을 짓기 위한 최대 시간 갱신 (선행 건물들 중 가장 늦게 끝나는 시간 기준)
                result[next] = Math.max(result[next], result[curr] + buildTime[next]);
                indegree[next]--;

                if (indegree[next] == 0) {
                    q.offer(next);
                }
            }
        }

        System.out.println(result[W]);
    }
}