class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String arr[] = num_str.split("");
        
        for(String a : arr)
            answer += Integer.parseInt(a);
        
        return answer;
    }
}