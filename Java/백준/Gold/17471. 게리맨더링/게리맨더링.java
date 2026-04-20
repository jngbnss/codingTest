import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

//9:30
public class Main {
    static int n;
    static int pop[];
    static ArrayList<Integer> list[];
    static int visited[];
    static int ret = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        pop = new int[n + 4];
        visited = new int[n + 4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            pop[i] = Integer.parseInt(st.nextToken());
        }
        list = new ArrayList[n + 4];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            for (int j = 0; j < count; j++) {
                list[i].add(Integer.parseInt(st.nextToken()));
            }
        }

        //리스트 연결 확인했으니까
        go(1); // 방문처리 하고 말고로 진행
        System.out.println(ret == Integer.MAX_VALUE ? -1 : ret);

    }

    static void go(int idx) {
        if (idx > n) {
            //
            ArrayList<Integer> teamA = new ArrayList<>();
            ArrayList<Integer> teamB = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (visited[i] == 1) {
                    teamA.add(i);
                } else {
                    teamB.add(i);
                }
            }
            if (teamA.isEmpty() || teamB.isEmpty()) {
                return;
            }
            if (isCon(teamA, 1) && isCon(teamB, 0)) {
                //둘다 연결되어있으면
                int a = 0;
                int b = 0;
                for (int i = 1; i <= n; i++) {
                    if (visited[i] == 1) {
                        a += pop[i];
                    } else {
                        b += pop[i];
                    }
                }
                ret = Math.min(ret, Math.abs(a - b));
            }
            return;
        }

        visited[idx] = 1;
        go(idx + 1);
        visited[idx] = 0;
        go(idx + 1);

    }

    static boolean isCon(ArrayList<Integer> subList, int type) {

        int[] localVisited = new int[n + 4];
        int cnt = 1;
        localVisited[subList.get(0)] = 1;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(subList.get(0));
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (Integer i : list[poll]) {
//                if (localVisited[i] == 0 && subList.contains(i)) {
                if (localVisited[i] == 0 && visited[i] == type) {
                    cnt++;
                    localVisited[i] = 1;
                    q.offer(i);
                }

            }
        }
        if (subList.size() == cnt) {
            return true;
        }

        return false;
    }
}
//0948
