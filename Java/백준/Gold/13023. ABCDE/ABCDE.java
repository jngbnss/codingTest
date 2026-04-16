import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static ArrayList<Integer> list[];
    static int visited[];
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        list = new ArrayList[n + 1];
        visited = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        int start = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);

        }
        int ret = 0;
        for(int i=1;i<=n;i++){
            Arrays.fill(visited,0);
            dfs(i,1);

        }

        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    static void dfs(int s,int depth) {
        if(flag){
            return;
        }
        if(depth==5){
            flag = true;
            return;
        }
        visited[s] = 1;
//        int cnt = 1;
        for (Integer i : list[s]) {
            if (visited[i] == 0) {
                dfs(i, depth + 1);
            }
        }
        visited[s] = 0;
    }
}
