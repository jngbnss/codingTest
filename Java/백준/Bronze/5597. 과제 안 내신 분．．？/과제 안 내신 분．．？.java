//package d1231.b3.q5597;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[]arr = new int[31];
//        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<28;i++){
            int number = Integer.parseInt(br.readLine());
            arr[number]++;
        }
        for (int i = 1; i <=30 ; i++) {
            if(arr[i]==0){
                System.out.println(i);
            }
        }

    }
}
