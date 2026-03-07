import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int input = 0;
            if(st.hasMoreTokens()){
                input = Integer.parseInt(st.nextToken());
            }
            if (order.equals("add")) {
                 //input = Integer.parseInt(st.nextToken());
                if (!list.contains(input)) {
                    list.add(input);
                }
            } else if (order.equals("remove")) {
                // input = Integer.parseInt(st.nextToken());
                if (list.contains(input)) {
                    for (int i1 = 0; i1 < list.size(); i1++) {
                        if (list.get(i1) == input) {
                            list.remove(i1);
                        }
                    }
                }
            } else if (order.equals("check")) {
                // input = Integer.parseInt(st.nextToken());
                if (!list.contains(input)) {
//                    System.out.println(0);
                    sb.append(0).append("\n");
                } else {
//                    System.out.println(1);
                    sb.append(1).append("\n");
                }
            } else if (order.equals("toggle")) {
                 //input = Integer.parseInt(st.nextToken());
                if (list.contains(input)) {
                    for (int i1 = 0; i1 < list.size(); i1++) {
                        if (list.get(i1) == input) {
                            list.remove(i1);
                        }
                    }
                } else {
                    list.add(input);
                }
            } else if (order.equals("all")) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int j = 1; j < 21; j++) {
                    temp.add(j);
                }
                list = temp;
            } else if (order.equals("empty")) {
                list = new ArrayList<>();
            }


        }
        System.out.println(sb.toString());

    }
}
