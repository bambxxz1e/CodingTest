class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pp = 0, yy = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(String.valueOf(s.charAt(i)).toLowerCase().equals("p")) pp++;
            if(String.valueOf(s.charAt(i)).toLowerCase().equals("y")) yy++;
        }
        
        if (pp == 0 && yy == 0) answer = true;
        else if(pp != yy) answer = false;

        return answer;
    }
}