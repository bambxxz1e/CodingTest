class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kk = String.valueOf(k);
        
        for(int l = i; l <= j; l++){
            String ll = String.valueOf(l);
            
            if(ll.contains(kk)){
                String arr[] = ll.split("");
                for(String num : arr){
                    if(num.equals(kk)) answer++;
                }
            }
        }
        
        return answer;
    }
}