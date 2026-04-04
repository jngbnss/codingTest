import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static Character arr[];
    static StringBuilder sb;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            arr = new Character[line.length()];
            visited = new boolean[line.length()];
            for (int j = 0; j < line.length(); j++) {
                arr[j] = line.charAt(j);
            }
            sb.append("Case # ").append(i).append(":").append('\n');
            int length = line.length();
            go(0, length, "");

        }
        System.out.println(sb.toString());

    }

    static void go(int idx, int length, String temp) {
        if (idx == length) {
            sb.append(temp).append('\n');
            return;
        }

        for (int i = 0; i < length; i++) {
            if (!visited[i]) {
                visited[i] = true;

                go(idx + 1, length, temp + arr[i]);
                visited[i] = false;
            }
        }
    }
}
