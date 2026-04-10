import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 진호의 MBTI 입력
        String jinho = sc.next();
        
        // 2. 친구 수 N 입력
        int n = sc.nextInt();
        
        int count = 0;
        
        // 3. N번만큼 친구들의 MBTI를 입력받아 비교
        for (int i = 0; i < n; i++) {
            String friend = sc.next();
            
            // 진호의 MBTI와 친구의 MBTI가 같은지 확인
            if (jinho.equals(friend)) {
                count++;
            }
        }
        
        // 4. 결과 출력
        System.out.println(count);
        
        sc.close();
    }
}