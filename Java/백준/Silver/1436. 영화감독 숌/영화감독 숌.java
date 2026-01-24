//package q1436;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        int ret = 0;
        for (int i = 666;i<Integer.MAX_VALUE;i++){

            String s = String.valueOf(i);
            if(s.contains("666")){
                cnt++;
                if(cnt==n){
                    ret = i;
                    break;
                }
            }
        }
        System.out.println(ret);
    }
}
