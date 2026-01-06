import java.util.*;
class Solution {
    public List<Integer> solution(int[] numbers, int num1, int num2) {
        // int[] answer =
            List<Integer>answer = new ArrayList<>();
        for(int i=num1;i<=num2;i++){
            answer.add(numbers[i]);
        }
        return answer;
    }
}