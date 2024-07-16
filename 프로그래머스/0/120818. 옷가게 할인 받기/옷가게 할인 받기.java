class Solution {
    public int solution(int price) {
        int a = (int)(price / 100000);
        int answer = 0;
        if(a >= 5) answer = (int)(price - (price * 0.2));
        else if(a < 5 && a >= 3) answer = (int)(price - (price * 0.1));
        else if(a < 3 && a >= 1) answer = (int)(price - (price * 0.05));
        else answer = price;
        return answer;
    }
}