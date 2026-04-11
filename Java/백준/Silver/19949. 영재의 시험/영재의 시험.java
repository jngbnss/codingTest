import java.io.*;
import java.util.*;

public class Main {
    static int n, ret;
    static int arr[];
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        list = new ArrayList<>();

        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        go(0, 0, 1, list);
        System.out.println(ret);

    }

    static void go(int idx, int prev, int condition, ArrayList<Integer> list) {
        if (idx == 10) {
            int cnt = 0;
            for (int i = 0; i < list.size(); i++) {
                if (arr[i] == list.get(i)) {
                    cnt++;
                }

                if (cnt >= 5) {
                    ret++;
                    break;
                }
            }
            return;
        }

        for (int i = 1; i < 6; i++) {
            if (i == prev) {
                if (condition < 2) {
                    list.add(i);
                    go(idx + 1, i, condition + 1, list);
                    list.remove(list.size() - 1);

                }
            } else {
                list.add(i);
                go(idx + 1, i, 1, list);
                list.remove(list.size() - 1);
            }
        }
    }

}
