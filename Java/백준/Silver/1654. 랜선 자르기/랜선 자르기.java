import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static long m, ret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Long.parseLong(st.nextToken());

        // a = 1 b =  mx값 찾아서
        // 그사이에 반값하면서 m개 만큼의 몫이 나오는
        //최대 mid값을 구하면 될것같은데
        // 그럼  배열로  잡고
        int[] arr = new int[n];

        long a = 1;
        long b = 0;
        for (int i = 0; i < n; i++) {
            arr[i] =Integer.parseInt(br.readLine());
            b = Math.max(b, arr[i]);
        }

        while (a <= b) {
            long mid = (a + b) / 2;
            long temp = 0;
            for (int i = 0; i < n; i++) {
                temp += arr[i] / mid;

            }
            if (temp >= m) {
                ret = Math.max(mid, ret);
                //여기서 더 큰 값을 구해보고 싶은거니까
                a = mid + 1;
            } else if (temp < m) {
                //몫이 구하려는 거보다 작아
                // 너무 크다는 거지 mid
                // mid 를 작게해줘야하니까
                b = mid - 1;
            }
//            else{
//                a = mid+1;
//            }

        }
        System.out.println(ret);

    }
}