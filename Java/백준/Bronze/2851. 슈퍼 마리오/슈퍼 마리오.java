import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[14];
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            int x  = Integer.parseInt(br.readLine());
            arr[i] = arr[i-1]+x;
        }
        for (int i = 1; i <11 ; i++) {
            if(arr[i]==100){
                System.out.println(100);
                return ;
            }else if(arr[i]>100){
                if(arr[i]-100<=100-arr[i-1]){
                    System.out.println(arr[i]);
                    return;
                }else{
                    System.out.println(arr[i-1]);
                    return;
                }
            }

        }
        System.out.println(arr[10]);

    }
}