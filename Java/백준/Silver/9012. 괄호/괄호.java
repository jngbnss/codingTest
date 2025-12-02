//package algorithm.stack.q9012;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        scanner.nextLine();
        for (int j = 0; j < nextInt; j++) {
            String line = scanner.nextLine();
            Deque<Character> stack = new ArrayDeque<>();
            for (int i = 0; i < line.length(); i++) {
                if(line.charAt(i)=='('){
                    stack.push('(');
                }else{
                    if(stack.isEmpty()||stack.peek()==')'){
                        stack.push(')');
                    }else if(!stack.isEmpty()&&stack.peek()=='('){
                        stack.pop();
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
