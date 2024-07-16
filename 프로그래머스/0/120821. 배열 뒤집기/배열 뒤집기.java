class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length];
        int a = answer.length;
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[a - 1];
            a--;
        }
        return answer;
    }
}