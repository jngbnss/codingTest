import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static int n, m;
    static int root[], cnt[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        root = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            root[i] = i;
        }
        int ret = 0;
        int idx = n;
        boolean flag = false;
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            n = Integer.min(n, a);
            n = Integer.min(n, b);

            if (find(a) != find(b)) {
                union(a, b);

//                if(root[a]>=i){
//                    if(flag) continue;
//                    else {
//                        ret = i;
//                        flag = true;
//                    }
//                }

            } else {
                if (flag) {
                    continue;
                }
                ret = i;
                break;
//                flag = true;
            }
            //순환여부는 어떻게 판단하지?
        }
        System.out.println(ret);

    }

    static int find(int x) {
        if (x == root[x]) {
            return x;
        }
        return root[x] = find(root[x]);
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        root[a] = b;
    }
}
