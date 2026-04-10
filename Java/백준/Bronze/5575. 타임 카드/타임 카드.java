import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 사람(A, B, C)에 대해 반복
        for (int i = 0; i < 3; i++) {
            // 출근 시간 입력 및 초 단위 변환
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int s1 = sc.nextInt();
            int startTimeInSeconds = h1 * 3600 + m1 * 60 + s1;

            // 퇴근 시간 입력 및 초 단위 변환
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            int s2 = sc.nextInt();
            int endTimeInSeconds = h2 * 3600 + m2 * 60 + s2;

            // 총 근무 시간(초)
            int totalSeconds = endTimeInSeconds - startTimeInSeconds;

            // 다시 시, 분, 초로 변환
            int h = totalSeconds / 3600;
            int m = (totalSeconds % 3600) / 60;
            int s = totalSeconds % 60;

            System.out.println(h + " " + m + " " + s);
        }

        sc.close();
    }
}