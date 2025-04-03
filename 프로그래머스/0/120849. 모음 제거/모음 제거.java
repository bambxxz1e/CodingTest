class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String remove[] = {"a", "e", "i", "o", "u"};
        
        for(int i = 0; i < remove.length; i++){
            if(my_string.contains(remove[i])){ // 문자 포함하면
                answer = my_string.replaceAll(remove[i], "");
                // 그거 지우고 공백없이 answer에 넣기
                my_string = answer; // my_string에도 넣기
            }
            else answer = my_string;
        }
        
        return answer;
    }
}