//package im.q2635;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 가장 많은 거를 하면 되는것같은데 30000까지 다돌려봐?
        int ret =0;
        int cnt =0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i <=n ; i++) {
            list.clear();
            list.add(n);
            list.add(i);
            while(true){
                int next = list.get(list.size()-2)-list.get(list.size()-1);

                if(next<0) break;
                list.add(next);
                cnt++;
            }
            if(list.size()>ret){
                result.clear();
                ret = list.size();
                result.addAll(list);
            }
        }
        System.out.println(ret);
        for (Integer integer : result) {
            System.out.print(integer+" ");
        }

    }
}

