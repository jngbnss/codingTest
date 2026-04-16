import java.io.*;
import java.util.*;

/**
 * 입력받고
 * 연결하고, 안하고 해서
 * 다 나오면 거기서 진행해보자
 * 몰빵인가?
 * 연결이 끊겼는가?
 * 비교했을때 최소차이가 정답이고
 * 만약 두 선거구로 나눌 수 없으면 -1
 * 8:09
 */
public class Main {
    static int n;
    static int populations[];

    static ArrayList<Integer>list[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        populations = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            int x = Integer.parseInt(st.nextToken());
            populations[i] = x;
        }

        list = new ArrayList[n+1];

        for(int i=1;i<=n;i++){
            list[i] = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int countOfSector = Integer.parseInt(st.nextToken());
            for(int j=0;j<countOfSector;j++){
                list[i].add(Integer.parseInt(st.nextToken()));
                // 이건 연결 되어있는지 확인할때 쓰는거니까
            }

        }
        count = new boolean[n+1];
        // 카운트 불리언 배열로 이번 구역나눌때 포함하냐 마냐로 구성할것
        go(1);
        System.out.println(ret==Integer.MAX_VALUE?-1:ret);

    }
    static boolean count[];
    static int ret = Integer.MAX_VALUE;
    static boolean isCon(ArrayList<Integer> team){
        int cnt = 1;
        int localVisited[] = new int[n+1];
        Integer i = team.get(0);
        localVisited[i] = 1;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(i);
        while(!q.isEmpty()){
            Integer now = q.poll();
            for (Integer next : list[now]) {
                if(localVisited[next]==0&&team.contains(next)){
                    cnt++;
                    localVisited[next] = 1;
                    q.offer(next);
                }
            }
        }
        return cnt==team.size();
    }
    static void go(int idx){
        if(idx==n+1){
            ArrayList<Integer> teamA = new ArrayList<>();
            ArrayList<Integer> teamB = new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(count[i] ==true){
                    teamA.add(i);
                }else{
                    teamB.add(i);
                }
            }
            // 카운트로 a랑 b구분했으니까

            // 몰빵인가?
            if(teamA.isEmpty()||teamB.isEmpty()){
                return;
            }

            // 연결이 잘 되어있는가?

            if(isCon(teamA)&&isCon(teamB)){
                // -1 인가 아니면 차이를 구하자
                int popA = 0;
                int popB =0;
                for (int i = 0; i < teamA.size(); i++) {
                    Integer i1 = teamA.get(i);
                    popA+=populations[i1];
                }
                for (int i = 0; i < teamB.size(); i++) {
                    Integer i1 = teamB.get(i);
                    popB+=populations[i1];
                }
                int temp = Math.abs(popA-popB);
                ret = Math.min(temp,ret);

            }
            return;
        }
        count[idx]= false;
        go(idx+1);
        count[idx]= true;
        go(idx+1);



    }
}
