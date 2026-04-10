import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 테스트 케이스 개수 입력
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        // 2. n번만큼 반복하며 각 k값을 처리
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            
            // 3. k번만큼 '=' 문자 출력
            for (int j = 0; j < k; j++) {
                System.out.print("=");
            }
            
            // 한 줄의 출력이 끝나면 줄바꿈
            System.out.println();
        }

        sc.close();
    }
}