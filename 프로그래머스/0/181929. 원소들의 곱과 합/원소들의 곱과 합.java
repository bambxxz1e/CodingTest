class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int div = 1; int sum = 0;
        for(Integer n : num_list){
            div *= n;
            sum += n;
        }
        
        if(div < sum * sum) answer = 1;
        
        return answer;
    }
}