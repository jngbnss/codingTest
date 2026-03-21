import java.io.*;
import java.util.*;

public class Main {
    static int n, cnt;
    static ArrayList<Integer> list, ret;
    static StringBuilder sb;
    static int visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cnt = Integer.parseInt(st.nextToken());
            if (cnt == 0) {
                break;
            }
            visited = new int[cnt];
            list = new ArrayList<>();
            ret = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                int input = Integer.parseInt(st.nextToken());
                list.add(input);
            }
            sb = new StringBuilder();
            go(0, 0);
            System.out.print(sb.toString());
            System.out.println();
        }
    }

    static void go(int start, int idx) {
        if (idx == 6) {
            for (int i = 0; i < cnt; i++) {
                if (visited[i] == 1) {
                    sb.append(list.get(i)).append(" ");
                }

            }
            sb.append("\n");
            return;


        }
        for (int i = start; i < cnt; i++) {
            visited[i] = 1;
            go(i + 1, idx + 1);
            visited[i] = 0;

        }

    }
}

