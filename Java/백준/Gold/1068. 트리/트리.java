import java.io.*;
import java.util.*;

public class Main {
    static int n, m, cnt;
    static ArrayList<Integer> list[];
    static int rootNode = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        list = new ArrayList[n]; // n+1까지 할 필요 없이 n이면 충분합니다.

        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int parent = Integer.parseInt(st.nextToken());
            if (parent == -1) {
                rootNode = i;
            } else {
                list[parent].add(i);
            }
        }

        m = Integer.parseInt(br.readLine());

        // 루트 자체가 삭제되면 리프 노드는 0개
        if (m == rootNode) {
            System.out.println(0);
        } else {
            go(rootNode);
            System.out.println(cnt);
        }
    }

    static void go(int idx) {
        int validChildren = 0;

        for (int child : list[idx]) {
            // 자식 노드가 삭제된 노드(m)가 아닐 때만 탐색을 이어갑니다.
            if (child != m) {
                validChildren++;
                go(child);
            }
        }

        // 삭제되지 않은 자식 노드가 하나도 없다면, 이 노드는 리프 노드입니다.
        if (validChildren == 0) {
            cnt++;
        }
    }
}