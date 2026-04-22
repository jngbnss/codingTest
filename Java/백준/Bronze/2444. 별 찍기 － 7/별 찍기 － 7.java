import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1. 상단 삼각형 (1번째 줄부터 N번째 줄까지)
        for (int i = 1; i <= N; i++) {
            // 공백 출력: N-i개
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별 출력: 2*i - 1개
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. 하단 역삼각형 (N-1번째 줄부터 1번째 줄까지)
        for (int i = N - 1; i >= 1; i--) {
            // 공백 출력: N-i개
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별 출력: 2*i - 1개
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}