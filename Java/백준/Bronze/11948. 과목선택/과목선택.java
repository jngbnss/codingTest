import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 과학 4과목 입력 및 합계 계산
        int[] science = new int[4];
        int sciSum = 0;
        for (int i = 0; i < 4; i++) {
            science[i] = sc.nextInt();
            sciSum += science[i];
        }

        // 2. 사회 2과목 입력 및 합계 계산
        int[] society = new int[2];
        int socSum = 0;
        for (int i = 0; i < 2; i++) {
            society[i] = sc.nextInt();
            socSum += society[i];
        }

        // 3. 각 세트에서 최솟값 찾기
        Arrays.sort(science); // 오름차순 정렬 (0번 인덱스가 최솟값)
        Arrays.sort(society);

        // 4. 전체 합계 - 각 세트의 최솟값
        int total = (sciSum - science[0]) + (socSum - society[0]);

        System.out.println(total);

        sc.close();
    }
}