import java.io.*;
import java.util.*;

public class Main {
    static int n, b, ret;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        ret = Integer.MAX_VALUE;

        // 0번 인덱스부터 시작, 현재 합은 0
        go(0, 0);
        System.out.println(ret);
    }

    static void go(int idx, int temp) {
        // 이미 선반 높이를 넘었다면 최솟값 갱신 후 종료
        if (temp >= b) {
            ret = Math.min(ret, temp - b);
            return;
        }

        // 모든 소를 다 확인했다면 종료
        if (idx == n) {
            return;
        }

        // 최적화: 이미 정답이 0이면 더 이상 계산할 필요 없음
        if (ret == 0) return;

        // 1. 현재 소(idx)를 선택하는 경우
        go(idx + 1, temp + arr[idx]);

        // 2. 현재 소(idx)를 선택하지 않는 경우
        go(idx + 1, temp);
    }
}