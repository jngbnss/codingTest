import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] numbers;
    static int[] ops = new int[4]; // +, -, *, / 의 개수 저장
    static int mx = Integer.MIN_VALUE;
    static int mn = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 입력 받기
        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            ops[i] = Integer.parseInt(st.nextToken());
        }

        // 2. 백트래킹 시작
        // 첫 번째 숫자를 초기값으로 넘기고, 인덱스는 1(두 번째 숫자)부터 시작
        go(1, numbers[0]);

        // 3. 결과 출력
        System.out.println(mx);
        System.out.println(mn);
    }

    static void go(int idx, int currentSum) {
        // 모든 숫자를 다 사용한 경우 (연산자를 n-1개 사용함)
        if (idx == n) {
            mx = Math.max(mx, currentSum);
            mn = Math.min(mn, currentSum);
            return;
        }

        // 4가지 연산자를 하나씩 시도
        for (int i = 0; i < 4; i++) {
            if (ops[i] > 0) { // 사용할 수 있는 연산자가 남아있다면
                ops[i]--; // 연산자 사용 처리

                // 연산자 종류에 따라 계산 후 다음 재귀 호출
                // 질문하신 대로 temp 변수 수정 없이 인자에서 직접 계산하여 전달
                if (i == 0) {
                    go(idx + 1, currentSum + numbers[idx]);
                } else if (i == 1) {
                    go(idx + 1, currentSum - numbers[idx]);
                } else if (i == 2) {
                    go(idx + 1, currentSum * numbers[idx]);
                } else if (i == 3) {
                    go(idx + 1, currentSum / numbers[idx]);
                }

                ops[i]++; // 재귀 종료 후 연산자 개수 원복 (백트래킹)
            }
        }
    }
}