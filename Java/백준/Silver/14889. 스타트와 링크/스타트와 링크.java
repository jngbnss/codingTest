import java.io.*;
import java.util.*;

public class Main {
    static int n, ret = Integer.MAX_VALUE;
    static int arr[][];
    static int visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        go(0, 0); // idx, visited
        System.out.println(ret);

    }

    static void go(int idx, int cnt) {

        if (cnt == n / 2) {
            int sumA = 0;
            int sumB = 0;
            ArrayList<Integer> start = new ArrayList<>();
            ArrayList<Integer> link = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (visited[i] == 1) {
                    start.add(i);
                } else {
                    link.add(i);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i] == 1 && visited[j] == 1) {
                        sumA += arr[i][j];
                    }
                    if (visited[i] == 0 && visited[j] == 0) {
                        sumB += arr[i][j];
                    }
                }
            }
            int temp = Math.abs(sumA - sumB);
            ret = Math.min(ret, temp);
            return;
        }

        // 조합 진행하는데 절반씩 하는거지 // list해서 절반만넘기자
        for (int i = idx; i < n; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                go(i + 1, cnt + 1);
                visited[i] = 0;
            }
        }


    }
}
