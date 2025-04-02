class Solution {
    public String solution(String rsp) {
        String answer = "";
        char arr[] = rsp.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            switch(arr[i]){
                case '0' : answer += "5"; break;
                case '2' : answer += "0"; break;
                case '5' : answer += "2"; break;
            }
        }
        
        return answer;
    }
}