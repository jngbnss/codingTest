import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int arr[];
    static int memo[][];

    /**
     * memo[idx][cnt==0] 지금 밟고 있는 곳이 첫번째 이전에는 2칸을 뛰어 올라오은데 연속된 2칸 일수도있고 2칸을 뛰어온 2칸일수도있음
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        memo = new int[n + 1][2];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if (n == 1) {
            System.out.println(arr[1]);
        } else {
            System.out.println(Math.max(dp(n, 0), dp(n, 1)));
        }
    }

    static int dp(int idx, int cnt) {
        if (idx == 1) {
            if (cnt == 0) {
                //지금 밟고있는게 처음이니까
                return arr[idx];
            } else {
                //첫번째를 2번 밟는건 말이 안되니까
                return -10000;
            }
        }
        if (idx == 2) {
            if (cnt == 0) {
                return arr[idx];
            } else {
                return arr[idx] + arr[idx - 1];
            }
        }
        if (idx <= 0) {
            return -1;
        }
        if (memo[idx][cnt] != -1) {
            return memo[idx][cnt];
        }

        int ret = 0;
        if (cnt == 0) {
            ret = Math.max(dp(idx - 2, 0), dp(idx - 2, 1)) + arr[idx];
        } else {
            ret = Math.max(ret, dp(idx - 1, 0) + arr[idx]);
        }
        return memo[idx][cnt] = ret;
    }
}
