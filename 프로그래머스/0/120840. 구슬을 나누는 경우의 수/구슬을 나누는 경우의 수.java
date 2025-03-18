class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        double a = 1, b = 1;
        
        for(int i = 0; i < share; i++){
            a *= (balls - i);
            b *= (share - i);
        }
        
        answer = (int)(a / b);
        
        return answer;
    }
}