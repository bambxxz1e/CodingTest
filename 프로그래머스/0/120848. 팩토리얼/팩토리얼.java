class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= 10; i++){
            int a = 1;
            for(int j = i; j >= 1; j--){
                a *= j;
            }
            if(a <= n) answer = i;
        }
        
        return answer;
    }
}