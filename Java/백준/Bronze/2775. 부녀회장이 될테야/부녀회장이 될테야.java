import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 아파트 만들기 (최대 14층, 14호이므로 15x15면 충분합니다)
        int[][] apt = new int[15][15];

        // 2. 0층 초기화 (0층 i호에는 i명이 산다)
        for (int i = 1; i < 15; i++) {
            apt[0][i] = i;
        }

        // 3. 나머지 층 채우기 (DP)
        for (int i = 1; i < 15; i++) { // 1층부터 14층까지
            for (int j = 1; j < 15; j++) { // 1호부터 14호까지
                // 핵심: i층 j호 = i층 j-1호(옆집까지의 합) + i-1층 j호(내 아랫집)
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        // 4. 테스트케이스 처리
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호
            sb.append(apt[k][n]).append("\n");
        }
        System.out.print(sb);
    }
}