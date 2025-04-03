class Solution {
    public int solution(int num1, int num2) {
        double answer = num1 * 1000;
        answer /= num2;
        return (int)answer;
    }
}