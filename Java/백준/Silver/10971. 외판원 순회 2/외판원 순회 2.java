import java.io.*;
import java.util.*;

/*
순열을 만들건데
맨 앞을 뒤에 한번더하자
만약 중간에 갈수없는 경우는 빼야겠지
0이면 무한을 넣자

그렇게했을때 가장작은거!

 */
public class Main {
    static int n;
    static int arr[][];
    static int visited[];
    static int ret = Integer.MAX_VALUE;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        list = new ArrayList<>();

        go(0, list);// idx
        System.out.println(ret);

    }

    static void go(int idx, ArrayList<Integer> list) {
        if (idx == n) {
            int start = list.get(0);
            list.add(start);
            int temp = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                int s = list.get(i);
                int e = list.get(i + 1);
                if (arr[s][e] == 0) {
                    list.remove(list.size()-1);
                    return;
                }
                temp += arr[s][e];
            }
            ret = Math.min(ret, temp);
            list.remove(list.size()-1);
            return;
        }
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                visited[i] = 1;
                list.add(i);
                go(idx+1,list);
                list.remove(list.size()-1);
                visited[i] = 0;

            }
        }
    }
}