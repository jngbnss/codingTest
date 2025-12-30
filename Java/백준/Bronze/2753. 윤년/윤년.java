//package b5.d1230.q2753;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ret = 0;
        int y = Integer.parseInt(br.readLine());
        if((y%4==0&&y%100!=0)||y%400==0){
            ret = 1;
        }
        System.out.println(ret);
    }
}
