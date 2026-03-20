import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            if (go(i)) {
                ret++;
            }
        }
        System.out.println(ret);
    }

    static boolean go(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        while (x > 0) {
            int temp = x % 10;
            list.add(temp);
            x/=10;

        }
        int gap = 0;
        if(list.size()<=2){
            return true;
        }
        gap = list.get(0)-list.get(1);
        boolean flag = true;
        for(int i=1;i<list.size()-1;i++){
            int temp=list.get(i)-list.get(i+1);
            if(gap!=temp){
                flag = false;
                break;
            }
        }
        if(flag){
            return true;
        }else{
            return false;
        }
    }
}

