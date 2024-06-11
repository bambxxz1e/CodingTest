class Solution {
    public int[] solution(int[] arr, int n) {
        
        int answer[]=new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
	        if(arr.length%2==0){
		        if(i%2!=0) arr[i]+=n;
	        }
	        else if(arr.length%2!=0){
		        if(i%2==0) arr[i]+=n;
	        }
        }  
        
        for(int j=0; j<answer.length; j++){
            answer[j]=arr[j];
        }
        
        return answer;
    }
}