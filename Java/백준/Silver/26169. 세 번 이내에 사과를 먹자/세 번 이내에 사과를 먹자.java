import java.io.*;
import java.util.*;

public class Main {
    static int y, x, ret;
    static boolean check = false;
    static int arr[][], visited[][];
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //5x5
        arr = new int[5][5];
        visited = new int[5][5];

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

            }
        }
        StringTokenizer st = new StringTokenizer(br.readLine());

        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        //4방을 하고 -1만 아니면 3번돌고 사과 2개면 트루 할까
        go(0, 0, y, x); // index , times, count
        if (check) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static void go(int idx, int cnt, int y, int x) {
        visited[y][x] = 1;

        if(cnt>=2){
            check = true;
            return;
        }
        if (idx == 3) {
            return;
        }

        //현재위치에서 4방탐색을 합시다
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || ny >= 5 || nx < 0 || nx >= 5) {
                continue;
            }

            if (visited[ny][nx] == 1 || arr[ny][nx] == -1) {
                continue;
            }

            boolean wasOne = false;
            // 만약 방문하지 않았다면
            if (arr[ny][nx] == 1) {
                wasOne = true;
                cnt++;
            }
            arr[ny][nx] = -1;
            go(idx + 1, cnt, ny, nx);
            // 갔다오면 원복을 풀자
            if (wasOne) {
                arr[ny][nx] = 1;
                cnt--;
            } else {
                arr[ny][nx] = 0;
            }
            visited[ny][nx] = 0;
        }
    }
}
