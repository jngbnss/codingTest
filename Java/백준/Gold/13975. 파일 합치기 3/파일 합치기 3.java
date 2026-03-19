import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long ret =0;
            PriorityQueue<Long> pq = new PriorityQueue<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){


                int i1 = Integer.parseInt(st.nextToken());
                pq.offer((long)i1);

            }
            while(!pq.isEmpty()){
                if(pq.size()==2){
                    ret+=pq.poll();
                    ret+=pq.poll();
                    break;
                }
                long temp = pq.poll();
                temp += pq.poll();

                ret+=temp;
                pq.offer(temp);
            }
            System.out.println(ret);

        }

    }
}

