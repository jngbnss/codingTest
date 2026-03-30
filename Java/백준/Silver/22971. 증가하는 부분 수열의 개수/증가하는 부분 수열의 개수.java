import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int arr[];
    static long memo[];
    static long mod = 998244353;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

         arr = new int[n];
         memo = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());

        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            memo[i] = 1; // 자기 자신만으로 구성된 수열 1개


            // i 이전의 원소들을 탐색
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    memo[i] = (memo[i]+memo[j]) % mod;

                }
            }
            sb.append(memo[i]).append(" ");
        }

        System.out.println(sb.toString());

    }
}
