class Solution {
    public int solution(int price) {
        int a = (int)(price / 100000);
        int answer = 0;
        if(a >= 5) answer = (int)(price * 0.8);
        else if(a < 5 && a >= 3) answer = (int)(price * 0.9);
        else if(a < 3 && a >= 1) answer = (int)(price * 0.95);
        else answer = price;
        return answer;
    }
}