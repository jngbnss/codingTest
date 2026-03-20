import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            int temp = i;
            int ret = temp;
            int now = temp;


            while(temp>0){
                now+=temp%10;
                temp/=10;
            }


            if(now==n){
                System.out.println(i);

                return;
            }
        }
        System.out.println(0);
    }
}

