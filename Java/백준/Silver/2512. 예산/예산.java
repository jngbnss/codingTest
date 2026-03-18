import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int arr[], mid, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            a = 1;
            b = Math.max(b, arr[i]);
        }
        int m = Integer.parseInt(br.readLine());
        // 그러면 주어진 애들 중에 작은 거랑 큰거일거아냐?
        ret = 0;
        while (a <= b) {
            int mid = (a + b) / 2;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] < mid) {
                    cnt += arr[i];
//                    System.out.println(cnt + " : " + mid);
                } else {
                    cnt += mid;
                }
            }
            if (cnt <= m) {
                ret = mid;
                a = mid + 1;
            } else {
                b = mid - 1;
            }


        }
        System.out.println(ret);

    }
}
