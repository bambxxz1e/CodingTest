class Solution {
    public long solution(String numbers) {
        String numbers_arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < numbers_arr.length; i++){
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
            // 숫자 단어를 배열 인덱스로
        }
        
        long answer = Long.parseLong(numbers);
        return answer;
    }
}