class Solution {
    public String solution(String n_str) {
        String answer = "";
        String arr[] = n_str.split("");
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("0")) arr[i] = "";
            else break;
        }
        
        answer = String.join("", arr);
        
        return answer;
    }
}