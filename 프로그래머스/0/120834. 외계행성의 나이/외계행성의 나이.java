class Solution {
    public String solution(int age) {
        String answer = "";
        String letter = "abcdefghij";
        String num[] = String.valueOf(age).split("");
        
        for(int i = 0; i < num.length; i++){
            answer += letter.charAt(Integer.parseInt(num[i]));
        }
        
        return answer;
    }
}