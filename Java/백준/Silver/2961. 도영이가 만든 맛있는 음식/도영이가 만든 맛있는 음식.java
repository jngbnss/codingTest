import java.io.*;
import java.util.*;

public class Main {
    static int n, ret = Integer.MAX_VALUE;
    static ArrayList<int[]> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a, b});
        }
        // 넣거나 말거나 니까 0 일때만 빼면
        go(0, 1, 0); // idx,넣고 빼고,temp
        System.out.println(ret);
    }

    static void go(int idx, int tempS, int tempB) {
        if (idx == n) {
            if (tempS == 1 && tempB == 0) {
                return;
            }
            int temp = Math.abs(tempS - tempB);
            ret = Math.min(temp, ret);
            return;
        }
        int[] arr = list.get(idx);
        int s = arr[0];
        int b = arr[1];
        go(idx + 1, tempS * s, tempB + b);
        go(idx + 1, tempS, tempB);

    }
}
