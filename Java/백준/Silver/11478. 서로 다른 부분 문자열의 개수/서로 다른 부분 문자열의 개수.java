import java.io.*;
import java.util.*;
public class Main {
    static String line;
    static HashSet<String> set;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         line = br.readLine();
        set = new HashSet<>();
        for(int idx=0;idx<line.length();idx++){

            go(idx,"", true);
            // 연속되어야하는데
        }
        System.out.println(set.size()-1);
//        for (String s : set) {
//            System.out.println(s);
//        }
    }
    static void go(int idx,String temp,boolean isStrike){ // 연속되어있으면 true 아니면 false
        if(!isStrike||idx==line.length()){
            set.add(temp);
            return;
        }


        go(idx+1,temp,false);
        temp+=line.charAt(idx);
        go(idx+1,temp,true);

    }
}
