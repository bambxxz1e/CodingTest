class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int a = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0) a++;
        }
        
        answer = new int[a];  
        
        int b = 0;
        
        for(int i = 0; i < answer.length; i++){
             for(int j = b + 1; j <= n; j++){
                 if(n % j == 0) {answer[i] = j; b = j; break;}
             }
        }
        
        return answer;
    }
}