class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++){
            int cal = numLog[i] - numLog[i - 1];
            
            switch(cal){
                case 1 -> answer += 'w';
                case -1 -> answer += 's';
                case 10 -> answer += 'd';
                case -10 -> answer += 'a';
            }
        }
        
        return answer;
    }
}