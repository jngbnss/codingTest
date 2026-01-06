import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        Arrays.sort(sides);
        if(sides[0]+sides[1]<=sides[2]) answer = 2;
        return answer;
    }
}