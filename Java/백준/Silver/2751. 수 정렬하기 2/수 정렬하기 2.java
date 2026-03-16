import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp = Integer.parseInt(br.readLine());
            list.add(temp);
        }
//        Arrays.sort(arr);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i:list){
            sb.append(i).append("\n");
        }
        System.out.println(sb.toString());

    }
}
