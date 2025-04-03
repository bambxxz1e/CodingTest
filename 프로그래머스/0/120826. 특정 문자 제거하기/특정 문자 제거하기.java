class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        if(my_string.contains(letter)) answer = my_string.replaceAll(letter, "");
        else answer = my_string;
        
        return answer;
    }
}