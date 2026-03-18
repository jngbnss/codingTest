import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            a = Math.min(a, input);
            b = Math.max(b, input);
            list.add(input);

        }
        Collections.sort(list);
        int temp = 2000000000;
        a = 0;
        b = list.size() - 1;
        int ret1 = 0;
        int ret2 = 0;
        while (a < b) {
            int now = list.get(a) + list.get(b);

            if (Math.abs(now) < Math.abs(temp)) {
                temp = now;
                ret1 = list.get(a);
                ret2 = list.get(b);
            }

            if (now == 0) {
                break;
            } else if (now < 0) {
                a++;
            } else {
                b--;
            }
            
        }
        System.out.println(ret1 + " " + ret2);
    }
}
