class Solution {
    public String solution(String myString) {
        String answer = "";
        
        myString = myString.toLowerCase();
        for(int i = 0; i < myString.length(); i++){
            answer += (myString.charAt(i) == 'a') ? 'A' : myString.charAt(i);
        }
        
        return answer;
    }
}