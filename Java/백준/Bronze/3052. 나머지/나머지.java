//package algorithm.map.q3052;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++){
            int nextInt = scanner.nextInt();
            map.put(nextInt%42,1);
        }
        int result =0;
        for (Integer key : map.keySet()) {
            if(map.get(key)>0){
                result++;
            }
        }
        System.out.println(result);
    }
}
