class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        
        for(int i = 0; i < array.length; i++){
            int a = Math.abs(array[i] - n);
            if(min > a) {min = a; answer = array[i];}
            else if(min == a){
                if(answer > array[i]) answer = array[i];
            }
        }

        return answer;
    }
}