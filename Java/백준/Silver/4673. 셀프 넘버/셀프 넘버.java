import java.io.*;
import java.util.*;

public class Main {
    static boolean[] arr;

    public static void main(String[] args) throws IOException {
        arr = new boolean[200004];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (!arr[i]) {
                sb.append(i).append("\n");

            }
            go(i);
        }
        System.out.println(sb.toString());
    }

    static void go(int i) {
        int temp = i;
        int ret = temp;
        while (temp > 0) {
            ret += temp % 10;
            temp /= 10;
        }
        arr[ret] = true;

    }
}
