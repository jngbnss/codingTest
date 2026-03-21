import java.io.*;
import java.util.*;

/*
순열로 1234
1243 똑같고
1324
 */
public class Main {
    static int n, ret = -1;
    static int arr[];
    static boolean visited[];
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visited = new boolean[n];
        list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        go(0, list);
        System.out.println(ret);
    }

    static void go(int idx, ArrayList<Integer> list) {
        if (idx == n) {
            cal(list);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(arr[i]);
                go(idx + 1, list);
//                list.removeLast();
                list.remove(list.size()-1);
                visited[i] = false;

            }
        }
    }

    static void cal(ArrayList<Integer> list) {
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            temp += Math.abs(list.get(i) - list.get(i + 1));
        }
        ret = Math.max(ret,temp);
    }
}
