import java.io.*;

public class Main {
    static int n,cnt;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        go(0,0);
        System.out.println(cnt);

    }

    static void go(int idx,int temp) {
        if (idx == n) {
            if(temp%3==0){
                cnt++;
            }
            return ;
        }

        if(idx==0){
            go(idx+1,1);
            go(idx+1,2);
        }else{
            for(int i=0;i<3;i++){
                go(idx+1,temp*10+i);
            }
        }
    }
}
