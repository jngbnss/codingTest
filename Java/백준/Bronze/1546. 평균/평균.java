//package bj.q1546;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        double mx = arr[n-1];
        double total =0;
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i])/mx*100;
            total+=arr[i];
//            System.out.println(arr[i]+" ");
        }
        System.out.println(total/n);

    }
}

