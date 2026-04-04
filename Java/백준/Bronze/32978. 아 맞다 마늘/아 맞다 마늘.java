import java.io.*;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String line = st.nextToken();
            map.put(line, 1);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            String line = st.nextToken();
            map.put(line, map.getOrDefault(line, 0) + 1);
        }

        for (String line : map.keySet()) {
            if (map.get(line) == 1) {
                System.out.println(line);
            }
        }
    }
}
