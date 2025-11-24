//package algorithm.week1.D10988;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        String s1 = stringBuilder.reverse().toString();

        if (s1.equals(s)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
