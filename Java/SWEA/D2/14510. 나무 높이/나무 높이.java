import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static int testCase, n;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= testCase; tc++) {
            sb.append("#").append(tc).append(" ");
            int ret = 0;
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int mx = 0;
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                mx = Math.max(mx, arr[i]);

            }
            int need2 = 0;
            int need1 = 0;
            int isitAllMx = 0;
            for (int i = 0; i < n; i++) {
                int gap = mx - arr[i];
                if (gap == 0) {
                    isitAllMx++;
                }
                need2 += gap / 2;
                need1 += gap % 2;

            }
            if (isitAllMx == n) {
                ret = 0;
            } else {
                if (need2 > need1) {
                    while (need2 - need1 > 1) {
                        need2--;
                        need1 += 2;
                    }
                }

                if (need2 > need1) {
                    ret = need2 * 2;
                } else if (need2 == need1) {
                    ret = need2 + need1;
                } else {
                    ret = need1 * 2 - 1;
                }

            }

            sb.append(ret).append("\n");
        }
        System.out.println(sb.toString());

    }
}
