import java.io.*;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String line = st.nextToken();
        StringBuilder smallA = new StringBuilder();
        StringBuilder bigA = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if(line.charAt(i)=='5'||line.charAt(i)=='6'){
                bigA.append(6);
                smallA.append(5);
            }else{
                smallA.append(line.charAt(i));
                bigA.append(line.charAt(i));
            }
        }

        String line1 = st.nextToken();
        StringBuilder smallB = new StringBuilder();
        StringBuilder bigB = new StringBuilder();
        for (int i = 0; i < line1.length(); i++) {
            if(line1.charAt(i)=='5'||line1.charAt(i)=='6'){
                bigB.append(6);
                smallB.append(5);
            }else{
                smallB.append(line1.charAt(i));
                bigB.append(line1.charAt(i));
            }
        }
        int sA = Integer.parseInt(smallA.toString());
        int sB = Integer.parseInt(smallB.toString());
        int bB = Integer.parseInt(bigB.toString());
        int bA = Integer.parseInt(bigA.toString());
//        System.out.println("sA = " + sA);
//        System.out.println("bA = " + bA);
//        System.out.println("sA = " + sA);
//        System.out.println("bA = " + bA);
        System.out.println((sA+sB)+" "+(bB+bA));


    }
}
