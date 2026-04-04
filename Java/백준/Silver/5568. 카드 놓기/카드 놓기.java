import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static int arr[];
    static boolean visited[];
    static HashSet<String> st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new int[n];
        visited = new boolean[n];
        st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        go(0, sb); // 0번째부터 시작해서 k만큼차면 빼고
        System.out.println(st.size());
    }

    static void go(int idx, StringBuilder sb) {
        if (idx == k) {
            st.add(sb.toString());
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int length = sb.length();
                sb.append(arr[i]);
                go(idx + 1, sb);
                sb.delete(length, sb.length());

                visited[i] = false;
            }
        }
    }
}
