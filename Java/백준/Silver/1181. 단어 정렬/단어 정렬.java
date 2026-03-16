import java.io.*;
import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        HashSet<String> strings = new HashSet<>();


        for(int i=0;i<n;i++){
//            arr[i] = br.readLine();
            strings.add(br.readLine());
        }
        ArrayList<String> list = new ArrayList<>(strings);

        // 길이가 짧은 것 부터
        // 사전 순
//        Arrays.sort(arr,(s1,s2)-> {
//            if (s1.length() == s2.length()) {
//                return s1.compareTo(s2);
//            }
//            return s1.length() - s2.length();
//        });

        Collections.sort(list,(a,b)->{
            if(a.length()==b.length()){
                return a.compareTo(b);
            }
            return a.length()-b.length();
        });
        for(String s:list){
            System.out.println(s);
        }

    }
}

