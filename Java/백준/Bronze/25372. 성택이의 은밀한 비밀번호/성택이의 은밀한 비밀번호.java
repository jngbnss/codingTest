import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String line = br.readLine();
            int length = line.length();
            if(length>=6&&length<=9){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}

