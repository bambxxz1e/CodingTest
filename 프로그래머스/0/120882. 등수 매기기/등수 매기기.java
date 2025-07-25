import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Integer[] avg = new Integer[score.length];
        
        for(int i = 0; i < score.length; i++){
            double a = score[i][0]; double b = score[i][1];
            avg[i] = (int)(Math.ceil((a + b) / 2));
        }
        
        Arrays.sort(avg, Collections.reverseOrder());
        
        for(int i = 0; i < score.length; i++){
            for(int j = 0; j < avg.length; j++){
                double a = score[i][0]; double b = score[i][1];
                if((int)(Math.ceil((a + b) / 2)) == avg[j]){
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}