import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 통장 잔고 입력 (최대 10억이므로 long 권장)
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        // 치킨 가격 입력
        long c = sc.nextLong();

        long totalBalance = a + b;
        long chickenPriceTwo = c * 2;

        // 치킨 두 마리를 살 수 있는지 확인
        if (totalBalance >= chickenPriceTwo) {
            // 살 수 있으면 남은 돈 출력
            System.out.println(totalBalance - chickenPriceTwo);
        } else {
            // 못 사면 원래 총액 출력
            System.out.println(totalBalance);
        }

        sc.close();
    }
}