class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = start_num--;
        }
        
        return answer;
    }
}