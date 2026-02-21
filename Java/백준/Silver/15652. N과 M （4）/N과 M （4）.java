import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static boolean visited[];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];

        //n개 안에서 m만큼 돌릴건데
        ArrayList<Integer> list = new ArrayList<>();
        combination(1,list);

    }
    static void combination(int start,ArrayList<Integer>list){
        if(list.size()==m){
            //하나씩 뽑아봅시다
            for(int i:list){

                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }

        for(int i=start;i<=n;i++){
            if(!visited[i]){
                list.add(i);
                combination(i,list);
                list.remove(list.size()-1);

            }

        }
    }
}
