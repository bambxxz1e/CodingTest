class Solution {
    public int[] solution(int[] arr, int n) {
        int a=0;
        if(arr.length%2==0){
            for(int i=0; i<arr.length; i++){
                if(i%2!=0){
                    arr[i]+=n;
                }
                a++;
            }
        }
        else{
            for(int j=0; j<arr.length; j++){
                if(j%2==0){
                    arr[j]+=n;
                }
                a++;
            }
        }
        
        int answer[]=new int[a];
        
        for(int k=0; k<answer.length; k++){
            answer[k]=arr[k];
        }
        
        return answer;
    }
}