

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<String> strings = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < n; i++) {
            sb.append("Case #").append(i+1).append(": ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                strings.push(st.nextToken());
            }
            while(!strings.isEmpty()){
                sb.append(strings.pop()).append(" ");
            }
            sb.append("\n");

        }
        System.out.println(sb.toString());


    }
}
