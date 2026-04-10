import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 네 명의 실력을 배열에 입력받음
        int[] skill = new int[4];
        for (int i = 0; i < 4; i++) {
            skill[i] = sc.nextInt();
        }

        // 2. 오름차순 정렬 (순서대로 A, B, C, D가 됨)
        Arrays.sort(skill);

        // 3. (가장 작은 값 + 가장 큰 값)과 (나머지 두 값의 합)의 차이 계산
        int team1 = skill[0] + skill[3];
        int team2 = skill[1] + skill[2];

        // 4. 절대값(Math.abs)을 사용하여 차이 출력
        System.out.println(Math.abs(team1 - team2));

        sc.close();
    }
}