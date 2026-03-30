import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int arr[];
    static int visited[];
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         arr = new int[9];
         visited = new int[9];
         for(int i=0;i<9;i++){
             arr[i] = Integer.parseInt(br.readLine());
         }
        ArrayList<Integer> list = new ArrayList<>();
         go(0,0,list); // idx  sum list

    }
    static void go(int idx,int sum,ArrayList<Integer> list ){
        if(idx==7){
            if(sum==100){
                flag = true;
                for (int i = 0; i < 7; i++) {
                    System.out.println(list.get(i));
                }
            }
            return ;
        }

        for(int i=0;i<9;i++){
            if(visited[i]==0){
                visited[i] = 1;
                list.add(arr[i]);
                go(idx+1,sum+arr[i],list);
                if(flag) return;
                list.remove(list.size()-1);
                visited[i] =0;
            }
        }


    }
}
