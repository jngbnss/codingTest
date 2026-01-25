//package q12927;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s="N"+s;
        char[] arr = s.toCharArray();
        int cnt = 0;

        for (int i = 1; i < s.length(); i++) {
            if(arr[i]=='Y'){
                cnt++;
                for(int j=i;j<s.length();j+=i){
                    if(arr[j]=='Y'){
                        arr[j] = 'N';
                    }else{
                        arr[j] = 'Y';
                    }
                }
            }
        }
        String string = Arrays.toString(arr);
//        System.out.println("string = " + string);
        if(string.contains("Y")) {
            System.out.println(-1);
        }else{
            System.out.println(cnt);
        }
    }
}
