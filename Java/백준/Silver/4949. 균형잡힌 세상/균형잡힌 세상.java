//package q4949;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            ArrayDeque<Character> stack = new ArrayDeque<>();
            String line = br.readLine();
            if(line.equals(".")){
                break;
            }
            for (int i = 0; i <line.length() ; i++) {
                if(line.charAt(i)=='('){
                    stack.push('(');
                }else if(line.charAt(i)=='['){
                    stack.push('[');
                }else if(line.charAt(i)==')') {
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else stack.push(')');
                }else if(line.charAt(i)==']'){
                    if(!stack.isEmpty()&&stack.peek()=='[') {
                        stack.pop();
                    }
                    else
                        stack.push(']');
                    }
                }


            if(stack.isEmpty()) sb.append("yes\n");
            else sb.append("no\n");

        }
        System.out.println(sb.toString());

    }
}

