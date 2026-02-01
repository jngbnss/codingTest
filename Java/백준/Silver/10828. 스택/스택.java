
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            if(line.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(line.equals("pop")){
                if(stack.isEmpty()){
                    sb.append(-1).append('\n');
                }else{
                    sb.append(stack.pop()).append('\n');
                }
            }else if(line.equals("size")){
                sb.append(stack.size()).append('\n');
            }else if(line.equals("empty")){
                if(stack.isEmpty()){
                    sb.append(1).append('\n');
                }else{
                    sb.append(0).append('\n');
                }
            }else if(line.equals("top")){
                if(stack.isEmpty()){
                    sb.append(-1).append('\n');
                }else{
                    sb.append(stack.peek()).append('\n');
                }
            }

        }
        System.out.println(sb.toString());

    }
}
