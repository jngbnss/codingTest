import java.io.*;
import java.util.*;

public class Main {
    static int n, mx, mn;
    static int visited[];
    static ArrayList<Character> operator;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 숫자 리스트 부터 받읍시다
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            list.add(x);

        }
        visited = new int[n - 1];
        operator = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            int count = Integer.parseInt(st.nextToken());
            for (int j = 0; j < count; j++) {
                if (i == 0) {
                    operator.add('+');
                } else if (i == 1) {
                    operator.add('-');
                } else if (i == 2) {
                    operator.add('*');
                } else {
                    operator.add('/');
                }
            }

        }
        // 입력받았고
        mx = Integer.MIN_VALUE;
        mn = Integer.MAX_VALUE;

        go(0, list.get(0));
        System.out.println(mx);
        System.out.println(mn);
    }

    static void go(int idx, int temp) {
        if (idx == n - 1) {
            mx = Math.max(mx, temp);
            mn = Math.min(mn, temp);
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                int ret = cal(temp, i, list.get(idx + 1)); // 현재 값 오퍼레이션 인덱스 , 다음 숫자
                go(idx + 1, ret);
                visited[i] = 0;
            }
        }
    }

    static int cal(int now, int op, int next) {
        Character c = operator.get(op);
        if (c == '+') {
            return now + next;
        } else if (c == '-') {
            return now - next;
        } else if (c == '*') {
            return now * next;
        } else {
            return now / next;
        }

    }
}
