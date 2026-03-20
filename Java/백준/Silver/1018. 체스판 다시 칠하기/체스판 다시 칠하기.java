import java.io.*;
import java.util.*;

public class Main {
    static int n, m, ret;
    static Character[][] arr;
    static Character[][] arr1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());// 행
        m = Integer.parseInt(st.nextToken());// 열

        arr = new Character[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        ret = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                ret = Math.min(ret, go(i, j));
            }
        }
        System.out.println(ret);
    }

    static int go(int y, int x) {
        int cnt = 0;
        char color = arr[y][x];

        for (int i = y; i < y + 8; i++) {
            for (int j = x; j < x + 8; j++) {
                if (arr[i][j] != color) {
                    cnt++;
                }
                color = (color == 'W') ? 'B' : 'W';
            }
            color = (color == 'W') ? 'B' : 'W';

        }
        return Math.min(cnt, 64 - cnt);
    }
}
