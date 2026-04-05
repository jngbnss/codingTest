import java.io.*;
import java.util.*;

public class Main {
    static int n, k, ret;
    static int arr[];
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        go(0, 500); // idx ret
        System.out.println(ret);

    }

    static void go(int idx, int temp) {
        if (idx == n) {
            if (temp >= 500) {
                ret++;
                return;
            }
        }
        if (temp < 500) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                go(idx + 1, temp - k + arr[i]);
                visited[i] = false;
            }
        }

    }
}
