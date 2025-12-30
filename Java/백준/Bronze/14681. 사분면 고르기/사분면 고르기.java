//package b5.d1230.q14681;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

//        int x = Integer.parseInt(st.nextToken());
//        int y = Integer.parseInt(st.nextToken());

        if(x>0){
            if(y>0){
                System.out.println(1);
            }else{
                System.out.println(4);
            }
        }else{
            if(y>0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }

    }

}
