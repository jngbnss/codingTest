import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력값이 비어있을 경우를 대비해 예외처리가 필요할 수 있지만, 기본 로직은 아래와 같습니다.
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        // 1. 먼저 삼각형의 합이 180인지 체크 (에러부터 걸러내기)
        if (a + b + c != 180) {
            System.out.println("Error");
        } 
        // 2. 세 각이 모두 같은 경우
        else if (a == 60 && b == 60 && c == 60) { 
            System.out.println("Equilateral");
        } 
        // 3. 두 각만 같은 경우 (합이 180임은 이미 위에서 보장됨)
        else if (a == b || b == c || c == a) {
            System.out.println("Isosceles");
        } 
        // 4. 그 외 (세 각이 모두 다른 경우)
        else {
            System.out.println("Scalene");
        }
    }
}