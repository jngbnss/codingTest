//package bj.q2908;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String line = st.nextToken();
        String line1 = st.nextToken();
        StringBuilder stringBuilder = new StringBuilder(line);
        StringBuilder stringBuilder1 = new StringBuilder(line1);
        String s1 = stringBuilder.reverse().toString();
        String s2 = stringBuilder1.reverse().toString();

        int i = Integer.parseInt(s1);
        int i1 = Integer.parseInt(s2);
        System.out.println(Math.max(i,i1));

    }
}
