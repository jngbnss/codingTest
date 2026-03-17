import java.io.*;
import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
            arr1.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);
        Collections.sort(arr1,Collections.reverseOrder());
        int ret = 0;



        for(int i=0;i<n;i++){
            ret+=arr.get(i)*arr1.get(i);
        }
        System.out.println(ret);


    }

}
