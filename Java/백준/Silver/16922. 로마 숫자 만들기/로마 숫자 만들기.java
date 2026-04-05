import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int arr[];
    static HashSet<Long> set;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[]{1, 5, 10, 50};
        visited = new boolean[4];
        set = new HashSet<>();
        go(0, 0, (long)0);//idx 가n이면 temp를 set에 넣자
        System.out.println(set.size());

    }

    static void go(int start,int idx, Long temp) {
        if (idx == n) {
            set.add(temp);
            return;
        }

        for (int i = start; i < 4; i++) {
            go(i,idx + 1, (Long)temp + arr[i]);
        }
    }
}
