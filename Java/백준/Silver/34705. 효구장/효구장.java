import java.io.*;
import java.util.*;

public class Main {
    static int n, ret;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr = new int[5];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {

                arr[j] = Integer.parseInt(st.nextToken());
            }

            //배열로 입력받고
            // 조합하기
            ret = 0; // 가능하면 1
            go(0, x, y, 0);
            if (ret == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }

    }

    static void go(int idx, int x, int y, int temp) {
        if (idx >= 5) {
            if (x <= temp && temp <= y) {
                ret = 1;

            }
            return;

        }

        if (ret == 1) {
            return;
        }
        go(idx + 1, x, y, temp + arr[idx]);
        go(idx + 1, x, y, temp);
    }
}
