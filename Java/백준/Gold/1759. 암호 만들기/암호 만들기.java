import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static int L,C;
    static boolean visited[];
    static char[] chars;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        // BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄 읽기 (L과 C)
        StringTokenizer st = new StringTokenizer(br.readLine());
         L = Integer.parseInt(st.nextToken()); // 암호의 길이
         C = Integer.parseInt(st.nextToken()); // 문자의 종류 개수
        visited = new boolean[C];

        // 두 번째 줄 읽기 (문자들)
        chars = new char[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            chars[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(chars);
        for (char aChar : chars) {
//            System.out.println(aChar);
        }
        sb = new StringBuilder();
        go(0,0,"");
        System.out.println(sb.toString());
    }
    static boolean check(String str){
        int moCnt =0 ;
        int jaCnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'
            ||str.charAt(i)=='e'
                    ||str.charAt(i)=='i'
                    ||str.charAt(i)=='o'
                    ||str.charAt(i)=='u'
            ) moCnt++;
            else{
                jaCnt++;
            }
        }
        if(moCnt<1||jaCnt<2){
            return false;

        }
        return true;
    }

    static void go(int start, int idx,String str){
        if(idx==L){
            if(check(str)){
                sb.append(str).append("\n");
                return;

            }
        }
        for(int i=start;i<C;i++){
            if(!visited[i]){
                visited[i] = true;
                go(i+1,idx+1,str+chars[i]);
                visited[i] = false;
            }

        }
    }
}