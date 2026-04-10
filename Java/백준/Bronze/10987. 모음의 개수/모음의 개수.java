import java.io.*;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a' ||
                    line.charAt(i) == 'e' ||
                    line.charAt(i) == 'i' ||
                    line.charAt(i) == 'o' ||
                    line.charAt(i) == 'u') {
                n++;
            }
        }
        System.out.println(n);
    }
}
