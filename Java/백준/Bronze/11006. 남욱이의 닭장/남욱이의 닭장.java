import java.io.*;
import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int t=0;t<n;t++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int i=0;i<=b;i++){
                if(i+(b-i)*2==a){
                    System.out.println(i+" "+(b-i));
                }
            }
        }
    }
}
