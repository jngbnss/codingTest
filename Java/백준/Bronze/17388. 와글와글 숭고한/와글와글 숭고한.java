import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt(); // 숭실대
        int k = sc.nextInt(); // 고려대
        int h = sc.nextInt(); // 한양대

        // 1. 합계가 100 이상인 경우
        if (s + k + h >= 100) {
            System.out.println("OK");
        } else {
            // 2. 합계가 100 미만인 경우 최솟값 찾기
            // 가장 낮은 점수가 누구의 것인지 판별
            if (s < k && s < h) {
                System.out.println("Soongsil");
            } else if (k < s && k < h) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }

        sc.close();
    }
}