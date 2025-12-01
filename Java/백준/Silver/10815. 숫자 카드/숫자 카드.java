// package algorithm.map.q10815;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int nextInt = scanner.nextInt();
            map.put(nextInt,1);
        }
        int m = scanner.nextInt();
        for (int i = 0; i <m; i++) {
            int next = scanner.nextInt();
            if(map.containsKey(next)){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }

        }
    }
}
