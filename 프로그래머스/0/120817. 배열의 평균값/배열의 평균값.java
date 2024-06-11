class Solution {
    public double solution(int[] numbers) {
        double a=0;
        int b=0;
        for(int i=0; i<numbers.length; i++){
            a+=numbers[i];
            b++;
        }
        double answer = 0;
        answer=a/b;
        return answer;
    }
}