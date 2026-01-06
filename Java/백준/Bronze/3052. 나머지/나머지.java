import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n%42]++;
        }
        int ret =0;
        for (int i : arr) {
            if(i!=0)ret++;
        }
        System.out.println(ret);

    }
}