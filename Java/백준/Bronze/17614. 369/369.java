import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long l = Long.parseLong(br.readLine());
        long result = 0;
        for (int i = 0; i <= l; i++) {
            String s= String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c=='3'||c=='6'||c=='9'){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}