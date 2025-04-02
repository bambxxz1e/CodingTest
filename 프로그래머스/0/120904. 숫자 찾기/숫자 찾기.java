class Solution {
    public int solution(int num, int k) {
        int answer = 0;
       
        String nums = String.valueOf(num);
        String kk = String.valueOf(k);
        
        answer = nums.indexOf(kk) + 1;
        
        if(answer == 0) answer = -1;
        
        return answer;
    }
}