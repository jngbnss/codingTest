import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 1000004;
    static int n;
    static int memo[], arr[];
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[INF];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        list = new ArrayList<>();

        list.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
            } else {
                insertFunction(list, arr[i]);
            }
        }
        System.out.println(list.size());

    }

    static void insertFunction(ArrayList<Integer> list, int temp) {
        int a = 0;
        int b = list.size() - 1;
        int res = 0; // 교체할 인덱스를 저장한 변수

        while (a <= b) {
            int mid = (a + b) / 2;
            if (list.get(mid) < temp) {
                a = mid + 1; // 새로 들어올애보다 이미 작으면 인덱스 높이기
            } else if (list.get(mid) >= temp) {
                // temp가 들어올 애니까
                res = mid;
                b = mid - 1;
            }
        }
        list.set(res, temp);

    }


}
