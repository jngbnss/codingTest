import java.io.*;
import java.util.*;

/*
백트래킹
1. 입력 받기
2. 함수 안에서 for문 순서대로
선택여부 확인
선택 안되었으면 선택하고 ret함수에 추가
다음 인덱스로 함수 진행
인덱스 기저사례에 도달하면 출력 후 함수 종료
함수 종료 후 선택 취소 처리

 */

public class Main {
    static int n;
    static int arr[], ret[];
    static boolean selected[];
    static StringBuilder sb;
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        ret = new int[n];
        selected = new boolean[n];
        sb = new StringBuilder();
        go(0, ret);
        System.out.println(sb.toString());

    }

    static void go(int idx, int[] ret) {
        if (idx == n) {

            for (int i = 0; i < n; i++) {
                sb.append(ret[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!selected[i]) {
                selected[i] = true;
                ret[idx] = arr[i];
                go(idx + 1, ret);
                selected[i] = false;
            }
        }
    }
}
