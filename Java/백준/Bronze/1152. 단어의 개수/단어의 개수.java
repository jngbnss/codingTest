import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();
        if(line.isBlank()){
            System.out.println(0);
            return;
        }
//        String trim = line.trim();
        String[] split = line.split(" ");
//        for (String s : split) {
//            System.out.println("s = " + s);
//        }
        System.out.println(split.length);
    }
}