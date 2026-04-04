import java.io.*;
import java.util.*;

public class Main {
    static int n, b, h, ret;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        ret = Integer.MAX_VALUE;

        go(-1, 0);// idx , temp
        System.out.println(ret);

    }

    static void go(int idx, int temp) {

        if (temp >= b) {
            ret = Math.min(ret, temp - b);

            return;
        }
        if (idx == n) {
            return;
        }

        for (int i = idx + 1; i < n; i++) {
            go(i, temp + arr[i]);
            go(i, temp);
            if(ret==0){
                return;
            }
        }
    }
}
