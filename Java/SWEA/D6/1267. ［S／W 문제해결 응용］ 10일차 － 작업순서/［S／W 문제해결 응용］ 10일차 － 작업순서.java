import java.io.*;
import java.util.*;

public class Solution {
    //10개의 순서 v,e가 주어짐
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= 10; testCase++) {
            sb.append("#").append(testCase).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            //9개의 간선이 있을텐데
            ArrayList<Integer>[] list = new ArrayList[v + 1];
            for (int i = 1; i <= v; i++) {
                list[i] = new ArrayList<>();
            }
            int[] arr = new int[v + 1];

            // 간선 정보를 저장할 때
            st = new StringTokenizer(br.readLine()); // 처음 한 줄 읽기
            for (int i = 0; i < e; i++) {
                // 만약 현재 st에 남은 숫자가 없다면? 다음 줄을 읽어와야 함
                if (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int start = Integer.parseInt(st.nextToken());

                // 도착점(end)을 읽을 때도 혹시 줄이 바뀔 수 있으니 체크 (보통은 start랑 붙어있지만 안전하게)
                if (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int end = Integer.parseInt(st.nextToken());

                list[start].add(end);
                arr[end]++;
            }
            // 일단 연결했고 // end에 추가

            //이제 0인애들찾아서 돌면서 빼자 그리고 리턴값을 넣자 아니면 그냥 바로 출력?
            ArrayList<Integer> result = new ArrayList<>();

            ArrayDeque<Integer> queue = new ArrayDeque<>();

            //함수 빼지말고 시작해보자
            for (int i = 1; i <= v; i++) {
                if (arr[i] == 0) {
                    queue.offer(i);
                }
            }

            while (!queue.isEmpty()) {
                Integer poll = queue.poll();
                result.add(poll);

                for (int j : list[poll]) {
                    arr[j]--;
                    if (arr[j] == 0) {
                        queue.offer(j);
                    }
                }
            }

            for (int i : result) {
                sb.append(i).append(' ');
            }

            sb.append("\n");
        }
        System.out.println(sb.toString());

    }
}
