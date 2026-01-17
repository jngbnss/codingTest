import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String ret="";
            for(int j=n;j>i;j--){
                ret+="*";
            }
            System.out.println(ret);


        }
    }
}