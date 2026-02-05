import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
           while(!stack.isEmpty()&& stack.peek()>b){
               stack.pop();
               cnt++;
           }


            if(b>0){
                if(stack.isEmpty()||stack.peek()<b){
                    stack.push(b);
                }
            }
        }
        cnt+=stack.size();
        System.out.println(cnt);

    }
}
