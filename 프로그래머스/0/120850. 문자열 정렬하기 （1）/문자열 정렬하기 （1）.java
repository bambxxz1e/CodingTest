import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        my_string = my_string.replaceAll("[a-z]", ""); // a부터 z까지 "" 치환
        
        answer = new int[my_string.length()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = my_string.charAt(i) - '0'; // 아스키 코드로 숫자 넣기
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}