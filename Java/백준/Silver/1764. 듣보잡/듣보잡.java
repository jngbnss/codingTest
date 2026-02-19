import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String line = br.readLine();
            map.put(line, 1);

        }
        ArrayList<String> names = new ArrayList<>();
        for(int j=0;j<m;j++){
            String line = br.readLine();
            Integer i = map.get(line);
            if(i!=null){
                names.add(line);
            }
        }
        System.out.println(names.size());
        Collections.sort(names);
        for(String s:names){
            System.out.println(s);
        }

    }
}
