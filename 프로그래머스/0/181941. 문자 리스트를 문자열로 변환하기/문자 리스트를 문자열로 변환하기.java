class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        for(String c : arr){
            answer += c.charAt(0);
        }
        
        return answer;
    }
}