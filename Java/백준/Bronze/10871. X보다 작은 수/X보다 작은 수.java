//package d1231.b5.q10871;
import java.io.*;
import java.util.*;
public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int temp = Integer.parseInt(st1.nextToken());
            if(temp<x){
                System.out.print(temp+" ");
            }
        }
    }
}
