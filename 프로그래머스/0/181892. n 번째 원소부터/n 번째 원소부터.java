class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (--n)];
        
        for(int i = 0; i < answer.length; i++)
            answer[i] = num_list[n++];
        
        return answer;
    }
}