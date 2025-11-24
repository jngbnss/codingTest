//package algorithm.week1.C2979;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = new int[104];
        for (int i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = x; j < y; j++) {
                arr[j]++;
            }
        }
        int ret = 0;
        for (int i = 0; i < 100; i++) {
            if (arr[i] == 3) {
                ret += c * 3;
            } else if (arr[i] == 2) {
                ret += b * 2;
            } else if (arr[i] == 1) {
                ret += a;
            }

        }
        System.out.println(ret);
    }
}
