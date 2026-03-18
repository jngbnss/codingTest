import java.io.*;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String order = st.nextToken();
            if (order.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }


        }
        Object[] array = set.toArray();
        Arrays.sort(array,Collections.reverseOrder());
        for (Object o : array) {
            System.out.println(o);
        }

    }
}
