
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input==0){
                stack.pop();
            }else{
                stack.push(input);
            }

        }
        int ret =0;
        for (Integer i : stack) {
            ret+=i;
        }
        System.out.println(ret);

    }
}

