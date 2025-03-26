import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char be[] = before.toCharArray();
        char af[] = after.toCharArray();
        
        Arrays.sort(be);
        Arrays.sort(af);
        
        String a = String.valueOf(af);
        String b = String.valueOf(be);
        
        if(a.equals(b)) answer = 1;
        
        return answer;
    }
}