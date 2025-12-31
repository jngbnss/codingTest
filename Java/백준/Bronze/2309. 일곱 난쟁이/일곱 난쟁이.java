//package sorting.q2309;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        for(int i=0;i<9;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        Arrays.sort(arr);
        int a=0;
        int b =0;
        boolean check = false;
        for (int i = 0; i < 9; i++) {
            for(int j=i+1;j<9;j++){
                if(sum-arr[i]-arr[j] ==100){
                    a = i;
                    b = j;
                    check = true;
                }
                if(check) break;
            }
            if(check) break;
        }

        for (int i = 0; i < 9; i++) {
            if(i==a||i==b) continue;
            else System.out.println(arr[i]);

        }

    }
}
