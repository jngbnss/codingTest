import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // 1. 오름차순 정렬
        Arrays.sort(arr);

        long minSum = Long.MAX_VALUE;
        long[] result = new long[3];

        // 2. 하나의 용액(i)을 고정하고 나머지 두 개를 투 포인터로 탐색
        for (int i = 0; i < N - 2; i++) {
            int left = i + 1;
            int right = N - 1;

            while (left < right) {
                long sum = arr[i] + arr[left] + arr[right];

                // 0에 더 가까운 합을 발견한 경우 갱신
                if (Math.abs(sum) < minSum) {
                    minSum = Math.abs(sum);
                    result[0] = arr[i];
                    result[1] = arr[left];
                    result[2] = arr[right];
                }

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    // 합이 정확히 0이면 가장 최선의 결과이므로 출력 후 종료
                    System.out.println(result[0] + " " + result[1] + " " + result[2]);
                    return;
                }
            }
        }

        // 결과 출력 (이미 정렬된 상태에서 탐색했으므로 오름차순 유지됨)
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}