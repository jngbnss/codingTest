
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[]arr= new int[28];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int temp = s.charAt(0) - 'a';
            arr[temp]++;
        }
        String ret="";
//        for (int i : arr) {
        for (int i = 0; i < 26; i++) {
            if(arr[i]>=5) {
                ret += (char) (i + 'a');
            }
        }

        if(ret.length()>0){
            System.out.println(ret);
        }else{
            System.out.println("PREDAJA");
        }
    }
}

