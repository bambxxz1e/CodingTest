class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int len = 0;
        while(k > 0){
            if(len < numbers.length) answer = numbers[len];
            else{
            	answer = numbers[len - numbers.length];
            	len -= numbers.length;
            }
            
            k--;
            len += 2;
        }
        
        return answer;
    }
}