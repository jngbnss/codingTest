import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){

            String line = br.readLine();
            int cnt =0;
            boolean check = false;
            int now =0;
            for(int i=0;i<line.length();i++){
                if(line.charAt(i)=='O'){
                    if(check){
                        now++;
                        cnt+=now;
                    }else{
                        now = 1;
                        cnt+=now;
                        check = true;
                    }
                }else{
                    check = false;
                    now =0;
                }
            }
            System.out.println(cnt);
        }

    }
}
