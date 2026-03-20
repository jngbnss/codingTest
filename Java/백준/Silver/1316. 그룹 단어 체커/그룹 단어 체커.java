import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ret = 0;
        for(int i=0;i<n;i++){
            String line = br.readLine();
            int[] arr = new int[26];
            boolean flag = true;
            int temp = line.charAt(0);
            for(int j=0;j<line.length();j++){
                int x = line.charAt(j) - 'a';

                if(arr[x]!=0&&temp!=line.charAt(j)){
                    flag = false;
                    break;
                }
                arr[x]++;
                temp=line.charAt(j);
            }
            if(flag) ret++;
        }
        System.out.println(ret);
    }
}
