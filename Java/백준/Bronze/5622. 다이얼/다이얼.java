import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // 단어 입력
        
        int totalTime = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // 한 글자씩 검사
            
            switch (ch) {
                case 'A': case 'B': case 'C':
                    totalTime += 3;
                    break;
                case 'D': case 'E': case 'F':
                    totalTime += 4;
                    break;
                case 'G': case 'H': case 'I':
                    totalTime += 5;
                    break;
                case 'J': case 'K': case 'L':
                    totalTime += 6;
                    break;
                case 'M': case 'N': case 'O':
                    totalTime += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    totalTime += 8;
                    break;
                case 'T': case 'U': case 'V':
                    totalTime += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    totalTime += 10;
                    break;
            }
        }
        
        System.out.println(totalTime);
    }
}