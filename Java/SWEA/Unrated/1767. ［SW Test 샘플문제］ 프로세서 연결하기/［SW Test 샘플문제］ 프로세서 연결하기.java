import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    static int testCase, n;
    static int totalLine, totalCnt;

    static int arr[][], visited[][], dist[][];
    static ArrayList<Node> list;
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= testCase; tc++) {
            sb.append("#").append(tc).append(" ");
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
//                String line = br.readLine();
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    if (arr[i][j] == 1) {
                        list.add(new Node(i, j));
                    }

                }
            }
            totalCnt = 0;
            totalLine = Integer.MAX_VALUE;
            go(0, 0, 0); // idx , cnt, line
            sb.append(totalLine).append("\n");
        }
        System.out.println(sb.toString());

    }

    static void go(int idx, int cnt, int line) {
        if (idx == list.size()) {
            if(cnt==0){
                return;
            }
            if (cnt > totalCnt) {
                totalLine = line;
                totalCnt = cnt;
//                return;
            } else if (cnt == totalCnt) {
                totalLine = Math.min(totalLine, line);
//                return;
            }
            return;
        }
        //idx만 관리하면 될듯
        int y = list.get(idx).y;
        int x = list.get(idx).x;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (isConnected(ny, nx, i)) { // 만약 연결이 가능하다면?
                int dist = connect(ny, nx, i, 2); // 2로 바꿔서 연결하고
                go(idx + 1, cnt + 1, line + dist);
                connect(ny, nx, i, 0);
            }
        }
        // 4방향이 다 연결이 안되더라도 될수도있잖아
        go(idx + 1, cnt, line);

    }

    static int connect(int ny, int nx, int dir, int changeNumber) {
        int cnt = 0;
        while (ny >= 0 && nx >= 0 && ny < n && nx < n) {
            arr[ny][nx] = changeNumber;
            cnt++;
            ny += dy[dir];
            nx += dx[dir];
        }
        return cnt;
    }

    static boolean isConnected(int ny, int nx, int dir) {
        while (ny >= 0 && nx >= 0 && ny < n && nx < n) {
            if (arr[ny][nx] == 0) {
                //1이나 2이면 안됨
                ny += dy[dir];
                nx += dx[dir];
            } else {
                return false;
            }


        }
        return true;
    }

    static class Node {
        int y;
        int x;

        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}


