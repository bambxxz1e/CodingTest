class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        String str[] = my_string.split("");
        String s = ""; 
        
        for(String a : str){
            s += a;
            if(s.equals(is_prefix)){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}