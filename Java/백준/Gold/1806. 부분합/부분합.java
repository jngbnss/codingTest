import java.io.*;
import java.util.*;

public class Main {
    static int n, s;
    static int arr[];
    static int psum[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());

        long ret = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x;
        }

        int start = 0;
        int end = 0;
        long temp = 0;

        while (true) {
            if (temp >= s) {
                ret = Math.min(ret, end - start);
                temp -= arr[start++];
            } else if (end == n) {
                break;
            } else {
                temp += arr[end++];
            }
            
        }
        System.out.println(ret == Integer.MAX_VALUE ? 0 : ret);

    }
}
/*
3 2
1 1 1
 */
