import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] arr; // 인접 행렬
    static int[] memo;  // 각 과목의 최소 이수 학기를 저장하는 메모리

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        memo = new int[n + 1]; // 0으로 초기화된 상태

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // a가 b의 선수 과목임 (a -> b)
            arr[b][a] = -1; // b 입장에서 선수 과목을 찾기 쉽게 역방향 기록
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            // 모든 과목에 대해 DFS를 호출하지만, 메모이제이션 덕분에 실제 연산은 한 번씩만 수행됨
            sb.append(dfs(i)).append(' ');
        }

        System.out.println(sb.toString().trim());
    }

    static int dfs(int idx) {
        // 1. 이미 계산된 결과가 메모장에 있다면 즉시 반환 (시간 초과 방지 핵심)
        if (memo[idx] != 0) {
            return memo[idx];
        }

        int maxBefore = 0;

        // 2. 현재 과목(idx)의 선수 과목들을 확인
        for (int i = 1; i <= n; i++) {
            if (arr[idx][i] == -1) {
                // 선수 과목들 중 가장 오래 걸리는 학기를 찾음
                maxBefore = Math.max(maxBefore, dfs(i));
            }
        }

        // 3. 결과 저장: (선수 과목 중 최대 학기) + 현재 과목(1학기)
        return memo[idx] = maxBefore + 1;
    }
}