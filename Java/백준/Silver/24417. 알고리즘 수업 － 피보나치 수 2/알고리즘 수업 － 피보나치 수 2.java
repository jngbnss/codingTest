import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long mod = 1000000007;

        // 변수 3개만 사용 (배열 X)
        long a = 1; // f[i-2]
        long b = 1; // f[i-1]
        long current = 0;

        for (int i = 3; i <= n; i++) {
            current = (a + b) % mod;
            a = b;
            b = current;
        }

        // n이 1, 2일 경우를 대비해 마지막 current 처리
        long firstResult = (n <= 2) ? 1 : current;

        System.out.println(firstResult + " " + (n - 2));
    }
}