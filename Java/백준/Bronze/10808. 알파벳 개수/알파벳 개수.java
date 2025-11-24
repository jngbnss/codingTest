// package algorithm.week1.B10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[26];
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            //System.out.println(s.charAt(i));
            arr[s.charAt(i)-'a']++;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
