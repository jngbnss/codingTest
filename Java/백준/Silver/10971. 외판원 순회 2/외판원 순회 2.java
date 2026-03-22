import java.io.*;
import java.util.*;
/**
 * 백트래킹
 *
 * 순열
 * 1234 1
 * 1423 1
 *
 */
public class Main {
    static int n;
    static int arr[][],visited[];
    static ArrayList<Integer>list;
    static int ret = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new int[n];
        list =new ArrayList<>();

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        go(0,list); // 함수 횟수 idx : n만큼 돌기
        System.out.println(ret);

    }

    static void go(int idx,ArrayList<Integer> subList){
        if(idx==n){
            int start = subList.get(0);
            subList.add(start);
            int temp = 0;
            for(int i=0;i<list.size()-1;i++){
                int from = list.get(i);
                int to = list.get(i+1);
                if(arr[from][to]==0){
                    list.remove(list.size()-1);
                    // 추가했던거 빼주고
                    return;
                }
                temp+=arr[from][to];
            }
            ret = Math.min(ret,temp);
            list.remove(list.size()-1);
            return;

        }

        for(int i=0;i<n;i++){
            if(visited[i]==0){
                visited[i] =1;
                list.add(i);
                go(idx+1,list);
                list.remove(list.size()-1);
                visited[i] =0;
            }
        }
    }
}
