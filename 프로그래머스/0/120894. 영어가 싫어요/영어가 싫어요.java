class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String nums = "";
        
        String n = "";
        for(int i = 0; i < numbers.length(); i++){
            n += numbers.charAt(i);
            
            switch(n){
                case "zero" : nums += '0'; n = ""; break;
                case "one" : nums += '1'; n = ""; break;
                case "two" : nums += '2'; n = ""; break;
                case "three" : nums += '3'; n = ""; break;
                case "four" : nums += '4'; n = ""; break;
                case "five" : nums += '5'; n = ""; break;
                case "six" : nums += '6'; n = ""; break;
                case "seven" : nums += '7'; n = ""; break;
                case "eight" : nums += '8'; n = ""; break;
                case "nine" : nums += '9'; n = ""; break;
            }
        }
        
        answer = Long.parseLong(nums);
        return answer;
    }
}