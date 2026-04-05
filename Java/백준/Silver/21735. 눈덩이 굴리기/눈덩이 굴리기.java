import java.io.*;
import java.util.*;

public class Main {
    static int n, m, now;
    static int arr[];
    static long ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        now = 1;
        go(0, -1, now);
        System.out.println(ret);
    }

    static void go(int idx, int pos, int temp) {
        if (idx == m || pos + 1 >= n) {
            ret = Math.max(temp, ret);
            return;
        }

        if (pos + 1 < n) {
            go(idx + 1, pos + 1, temp + arr[pos + 1]);
        }
        if (pos + 2 < n) {
            go(idx + 1, pos + 2, temp / 2 + arr[pos + 2]);
        }
    }
}
