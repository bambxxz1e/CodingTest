class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        
        for(int i = 0, j = answer.length - 1; i < answer.length; i++)
            answer[i] = s.charAt(j--) - '0';
         
        return answer;
    }
}