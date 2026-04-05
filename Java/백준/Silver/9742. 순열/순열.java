import java.io.*;
import java.util.*;

public class Main {
    static int k, cnt;
    static String n, ret;
    static boolean visited[];
    static int[] factorial = new int[11];
    static char[] resultArr; // 순열을 담을 배열

    public static void main(String[] args) throws IOException {
        getFactorial();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            if (!st.hasMoreTokens()) break;

            n = st.nextToken();
            k = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            sb.append(n).append(" ").append(k).append(" = ");
            
            if (k > factorial[n.length()]) {
                sb.append("No permutation");
                System.out.println(sb.toString());
                continue;
            }

            ret = "No permutation";
            visited = new boolean[n.length()];
            resultArr = new char[n.length()]; // 매 케이스마다 배열 준비
            cnt = 0;
            
            go(0);
            
            sb.append(ret);
            System.out.println(sb.toString());
        }
    }

    static void getFactorial() {
        factorial[0] = 1;
        for (int i = 1; i <= 10; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
    }

    static void go(int idx) {
        // 이미 찾았다면 즉시 리턴 (가장 중요)
        if (!ret.equals("No permutation")) {
            return;
        }

        if (idx == n.length()) {
            cnt++;
            if (cnt == k) {
                ret = new String(resultArr); // 찾았을 때만 딱 한 번 String 객체 생성
            }
            return;
        }

        for (int i = 0; i < n.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                resultArr[idx] = n.charAt(i); // 배열의 특정 위치에 값을 덮어쓰기 (메모리 사용 X)
                go(idx + 1);
                visited[i] = false;
            }
        }
    }
}