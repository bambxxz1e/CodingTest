import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
	    Arrays.sort(array); // [0, 0, 0, 2, 3, 4, 5, 5]
        int count[] = new int[array[array.length - 1] + 1]; // count 배열 길이 6
        
        for(int i = 0; i < array.length; i++){
            count[array[i]]++; // [3, 0, 1, 1, 1, 2]
        }
        
        int top = count[0]; // top = 3
        
        for(int i = 1; i < count.length; i++){
            if(count[i] > top) {
                top = count[i]; 
                answer = i; // count의 인덱스는 array의 숫자이기 때문
            }
            else if(count[i] == top){
                answer = -1;
            }
        }
        
        return answer; // 조건 충족하지않아 그대로 0 출력
    }
}