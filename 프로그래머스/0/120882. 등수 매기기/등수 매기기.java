import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        int[] avg = new int[score.length];
        int[] rank = new int[score.length];
        
        for(int i=0;i<score.length;i++){
            avg[i] = score[i][0]+score[i][1];
            rank[i] = score[i][0]+score[i][1];
        }
        
        Arrays.sort(rank);
        
        for(int i=0;i<avg.length;i++){
            for(int j=rank.length-1;j>=0;j--){
                if(avg[i]==rank[j]){
                    answer[i] = avg.length-j;
                    break;
                }
            }
        }
        
        return answer;
    }
}