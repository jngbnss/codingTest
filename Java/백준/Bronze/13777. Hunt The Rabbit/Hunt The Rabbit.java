import java.io.*;
import java.util.*;

public class Main {
    static int n, m, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            int a = 1;
            int b = 50;
            while (a <= b) {
                int mid = (a + b) / 2;
                if (n == mid) {
                    sb.append(mid).append('\n');
                    break;
                } else if (mid > n) {
                    b = mid - 1;
                    sb.append(mid).append(" ");
                } else {
                    a = mid + 1;
                    sb.append(mid).append(" ");
                }
            }


        }
        System.out.println(sb.toString());

    }
}
