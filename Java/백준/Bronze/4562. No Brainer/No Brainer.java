import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                // 등호(>=)와 문자열 대문자 확인!
                if (x >= y) {
                    System.out.println("MMM BRAINS");
                } else {
                    System.out.println("NO BRAINS");
                }
            }
        }
        sc.close();
    }
}