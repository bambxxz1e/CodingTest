class Solution {
    public String solution(String letter) {
        String answer = "";
        String mos[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String arr[] = letter.split(" ");
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < mos.length; j++){
                if(arr[i].equals(mos[j])){
                    answer += (char)(97 + j);
                    break;
                }
            }
        }
        
        return answer;
    }
}