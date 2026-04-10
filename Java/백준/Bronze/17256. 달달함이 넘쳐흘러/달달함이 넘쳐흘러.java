import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A의 좌표 입력 (ax, ay, az)
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int az = sc.nextInt();

        // C의 좌표 입력 (cx, cy, cz)
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int cz = sc.nextInt();

        // B의 좌표 계산
        int bx = cx - az;
        int by = cy / ay;
        int bz = cz - ax;

        // 결과 출력
        System.out.println(bx + " " + by + " " + bz);

        sc.close();
    }
}