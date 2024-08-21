class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer = n;
        
        while(t >= 1){
            answer *= 2;
            t--;
        }
        
        return answer;
    }
}