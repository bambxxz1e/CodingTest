import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int a = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            a++;
        }
        answer = array[a/2];
        return answer;
    }
}