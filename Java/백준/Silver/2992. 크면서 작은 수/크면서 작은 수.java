import java.io.*;
import java.util.*;

public class Main {
    static int n, ret = Integer.MAX_VALUE, size;
    static int arr[];
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        size = line.length();
//        System.out.println(size);
        n = Integer.parseInt(line);
        int temp = n;
        int idx = 0;
        visited = new boolean[size];

        arr = new int[size];
        while (temp >= 0) {
            arr[idx++] = temp % 10;
            temp /= 10;
            if (temp == 0) {
                break;
            }
        }
        go(0, 0);
        System.out.println(ret == Integer.MAX_VALUE ? 0 : ret);
    }

    static void go(int idx, int temp) {
        if (idx == size) {
            if (n < temp) {
                ret = Math.min(ret, temp);
            }
            return;
        }

        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                visited[i] = true;
                go(idx + 1, temp * 10 + arr[i]);
                visited[i] = false;
            }
        }
    }
}
