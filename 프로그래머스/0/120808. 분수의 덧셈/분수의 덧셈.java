class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        answer = new int[2];

        int mo = denom1 * denom2;
        int ja = (numer1 * denom2) + (numer2 * denom1);
        
        for(int i = ja; i > 1; i--){
            if((mo % i) == 0 && (ja % i) == 0){
                mo /= i; ja /= i;
            }
        }   
        
        answer[0] = ja; answer[1] = mo;
        
        return answer;
    }
}