import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            x1 = Integer.min(x1, i1);
            y1 = Integer.min(y1, i2);
            x2 = Integer.max(x2, i1);
            y2 = Integer.max(y2, i2);
        }
        System.out.println((x2 - x1) * (y2 - y1));
    }
}
