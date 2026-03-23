import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int minTime = Integer.MAX_VALUE;
        int winner = 0;

        for (int i = 1; i <= k; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            // 수정된 공식: (오른쪽 끝까지 거리) + (1행까지 거리) + (식당입구 1칸)
            // T = (m - c) + (r - 1) + 1 = m - c + r
            int currentTime = m - c + r;

            if (currentTime < minTime) {
                minTime = currentTime;
                winner = i;
            }
            // 시간이 같으면 번호가 작은 학생이 우선이므로 
            // else if로 갱신할 필요 없이 처음 발견된 minTime을 유지하면 됩니다.
        }

        System.out.println(winner);
    }
}