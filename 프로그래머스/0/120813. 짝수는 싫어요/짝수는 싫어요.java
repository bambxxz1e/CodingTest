class Solution {
    public int[] solution(int n) {
        int length = 0;
        for(int i = 1; i <= n; i+=2){
            length++;
        }
        int[] answer = new int[length];
        int a = 0;
        for(int i = 1; i <= n; i+=2){
            answer[a] = i;
            a++;
        }
        return answer;
    }
}