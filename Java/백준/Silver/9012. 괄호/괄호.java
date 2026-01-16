import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            String line = br.readLine();
            ArrayDeque<Object> stack = new ArrayDeque<>();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if(c=='('){
                    stack.push(c);
                }else{
                    if(!stack.isEmpty()&& stack.peek().equals('(')){
                        stack.pop();
                    }
                    else{
                        stack.push(c);
                    }
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}