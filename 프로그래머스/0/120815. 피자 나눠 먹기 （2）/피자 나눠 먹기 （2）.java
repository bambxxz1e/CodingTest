class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(true){
            if((n * answer) % 6 == 0) {answer = (n * answer) / 6; break;}
            answer++;
        }
        
        return answer;
    }
}