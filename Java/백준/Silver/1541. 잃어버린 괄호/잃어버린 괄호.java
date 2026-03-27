import java.io.*;
import java.util.*;
public class Main {
    static int n;
    static ArrayList<Character>op;
    static ArrayList<Integer>number;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] groups = line.split("-"); // 1. 마이너스 기준으로 쪼개기
        int totalSum = Integer.MAX_VALUE; // 초기값 설정

        for (int i = 0; i < groups.length; i++) {
            int tempSum = 0;

            // 2. 쪼개진 그룹 안의 숫자들을 모두 더함 (예: "50+40" -> 90)
            String[] additions = groups[i].split("\\+");
            for (String s : additions) {
                tempSum += Integer.parseInt(s);
            }

            // 3. 첫 번째 그룹이면 totalSum에 대입, 그 외엔 무조건 뺌
            if (totalSum == Integer.MAX_VALUE) {
                totalSum = tempSum;
            } else {
                totalSum -= tempSum;
            }
        }
        System.out.println(totalSum);
    }
}
