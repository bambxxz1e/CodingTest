class Solution {
    public String solution(String my_string) {
        String answer = "";
        char arr[] = my_string.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= 90) {
                arr[i] += 32;
                answer += String.valueOf(arr[i]);
            }
            else{
                arr[i] -= 32;
                answer += String.valueOf(arr[i]);
            }
        }
        return answer;
    }
}