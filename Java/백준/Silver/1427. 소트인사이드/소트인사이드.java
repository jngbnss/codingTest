import java.io.*;
import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long l = Long.parseLong(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        while(l>0){
            list.add( (int) l%10) ;
            l/=10;

        }
        Collections.sort(list,Collections.reverseOrder());

       for(int i=0;i<list.size();i++){
           System.out.print(list.get(i));
       }
    }
}
