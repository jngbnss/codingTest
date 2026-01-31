//package q28278;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            if(input==1){
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            }else if(input ==2){
                if(stack.isEmpty()){
                    sb.append("-1").append("\n");
//                    System.out.println(-1);
                }else{
                    sb.append(stack.pop()).append("\n");
//                    System.out.println(stack.pop());
                }
            }else if(input ==3){
//                System.out.println(stack.size());
                sb.append(stack.size()).append("\n");
            }else if(input==4){
                if(stack.isEmpty()){
//                    System.out.println(1);
                    sb.append("1").append("\n");
                }else{
//                    System.out.println(0);
                    sb.append("0").append("\n");
                }

            }else{
                if(stack.isEmpty()){
//                    System.out.println(-1);
                    sb.append("-1").append("\n");
                }else{
//                    System.out.println(stack.peek());
                    sb.append(stack.peek()).append("\n");
                }
            }
        }
        System.out.println(sb.toString());

    }
}
