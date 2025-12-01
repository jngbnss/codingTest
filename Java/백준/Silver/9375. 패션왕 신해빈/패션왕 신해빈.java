//package algorithm.map.q9375;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while(n--!=0){
            HashMap<String, Integer> map = new HashMap<>();
            int m = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < m; i++) {
                String line = scanner.nextLine();
                String[] split = line.split(" ");
                Integer exist = map.getOrDefault(split[1], 0);
                map.put(split[1],exist+1);

            }
            int ret = 1;
            for (Integer value : map.values()) {
                ret*=(value+1);
            }
            System.out.println(ret-1);
        }
    }
}
