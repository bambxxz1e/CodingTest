class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char arr[] = my_string.toCharArray();
        char a = arr[num2];
        arr[num2] = arr[num1];
        arr[num1] = a;
        
        answer = String.valueOf(arr);
        
        return answer;
    }
}