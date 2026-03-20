import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int ret = 0;
        while(true){
            if(n%5!=0){
                ret++;
                n-=3;
                if(n<0){
                    ret=-1;
                    break;

                }
            }else if(n%5==0){
                ret+=n/5;
                break;
            }else{
                ret = -1;
                break;
            }

        }

        System.out.println(ret);
    }
}
