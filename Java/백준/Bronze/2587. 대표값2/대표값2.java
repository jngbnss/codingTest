//package sorting.q2587;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        int [] arr = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        Arrays.sort(arr);
        System.out.println(sum/5+"\n"+arr[2]);

    }
}
