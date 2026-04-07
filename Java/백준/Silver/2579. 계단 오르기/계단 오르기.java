import java.io.*;
import java.util.*;

public class Main {
    static final int UNUSED = -1;
    static int n;
    static int[][] memo;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        memo = new int[n + 1][3];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], UNUSED);
        }

        if (n == 1) {
            System.out.println(arr[1]);
        } else {
            System.out.println(Math.max(dp(n, 1), dp(n, 2)));
        }


    }

    static int dp(int idx, int cnt) {
        if (idx == 1) {
            return (cnt == 1) ? arr[1] : -1;
        }
        if (idx == 2) {
            if (cnt == 1) {
                return arr[2]; // 0 -> 2 (2칸 점프)
            }
            if (cnt == 2) {
                return arr[1] + arr[2]; // 1->2 (1칸이동)
            }
        }

        if (idx <= 0) {
            return -1;
        }
        if (memo[idx][cnt] != -1) {
            return memo[idx][cnt];
        }

        int res = 0;
        if (cnt == 1) { //내려가는 중에 첫번째 계단 앞으로 연속으로 내려가던 2개를 내려가던 상관없음
            res = Math.max(dp(idx - 2, 1), dp(idx - 2, 2)) + arr[idx];
            // 지금 밟고 있는게 첫번째가 되려면 무조건 2칸을 올라온 상태여야하는데
            // 이전에도 2칸을 뛰어온 애일수도있고, 1,1을 밟아온애일수도있잖아
        } else if (cnt == 2) {
            res = dp(idx - 1, 1) + arr[idx];
        }
        return memo[idx][cnt] = res;
    }
}
