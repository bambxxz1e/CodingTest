class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char c[] = new char[my_string.length()];
        int index = my_string.length() - 1;
        
        for(int i = 0; i < c.length; i++){
            c[i] = my_string.charAt(index);
            index--;
        }
    
        answer = String.valueOf(c);
        
        return answer;
    }
}