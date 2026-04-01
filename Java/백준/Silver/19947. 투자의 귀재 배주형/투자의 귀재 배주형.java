import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 15;
    static int n, h, y;
    static long memo[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        memo = new long[INF];
        Arrays.fill(memo, -1);
//        Arrays.fill(memo,INF);

        memo[0] = h;
        for (int i = 1; i <= y; i++) {
            if (i - 1 >= 0) {
                memo[i] = Math.max(memo[i], (long) (memo[i - 1] * 1.05));
            }
            if (i - 3 >= 0) {
                memo[i] = Math.max(memo[i], (long) (memo[i - 3] * 1.2));
            }
            if (i - 5 >= 0) {
                memo[i] = Math.max(memo[i], (long) (memo[i - 5] * 1.35));
            }
        }
        for (int i = 0; i < 10; i++) {
//            System.out.println(memo[i]);
        }
        System.out.println(memo[y]);

    }


}
