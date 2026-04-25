import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 총 사탕의 개수 N 입력
        int N = sc.nextInt();
        int count = 0;

        // A: 영훈, B: 택희, C: 만세
        // 모든 경우의 수를 탐색 (완전 탐색)
        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                for (int c = 1; c <= N; c++) {
                    // 1. 총합이 N이어야 함
                    if (a + b + c == N) {
                        // 2. 영훈(a) >= 택희(b) + 2
                        if (a >= b + 2) {
                            // 3. 만세(c)는 짝수이며, 각자 최소 1개 이상 (반복문 시작이 1이라 1개 이상은 충족)
                            if (c % 2 == 0) {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(count);
        sc.close();
    }
}