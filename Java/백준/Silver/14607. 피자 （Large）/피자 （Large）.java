import java.io.*;
import java.util.*;

public class Main {
    static final int UNUSED = -1_000_001;
    static long n;
    static long memo[];
    static int arr[];

    public static void main(String[] args) throws IOException {
        /**
         * 설계다하고 진행하자
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Long.parseLong(br.readLine());
        System.out.println((n*(n-1))/2);

    }

}
