//package algorithm.map.q1920;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int nextInt = scanner.nextInt();
            set.add(nextInt);
        }

        int m = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int nextInt = scanner.nextInt();
            if (set.contains(nextInt)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}