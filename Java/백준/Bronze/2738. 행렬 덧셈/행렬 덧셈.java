//package d1231.b3.q2738;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] ret = new int[n][m];
        for(int i=0;i<n;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(st1.nextToken());

            }
        }

        for(int i=0;i<n;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(st1.nextToken());

            }
        }

        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                ret[i][j] = arr1[i][j]+arr2[i][j];

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ret[i][j]+" ");
            }
            System.out.println();
        }
    }
}
