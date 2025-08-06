class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            char a = my_string.charAt(i);
            answer += (a == alp.charAt(0)) ? String.valueOf(a).toUpperCase() : a;
        }
        
        return answer;
    }
}