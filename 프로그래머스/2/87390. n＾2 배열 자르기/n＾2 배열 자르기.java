class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        answer = new int[(int)(right - left) + 1];
        
        int l = 0;
        for(long i = left; i <= right; i++){        
            answer[l] = (int)((Math.max(i / n, i % n)) + 1);
            l++;
        }
        
        return answer;
    }
}