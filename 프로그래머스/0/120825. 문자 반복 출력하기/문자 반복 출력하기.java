class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char arr[] = new char[n * my_string.length()];
        int i = 0;
        
        for(int j = 0; j < arr.length; j++){
            arr[j] = my_string.charAt(i);
            if((j + 1) % n == 0) i++;
        }
        
        answer = String.valueOf(arr);
        
        return answer;
    }
}