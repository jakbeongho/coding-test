import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        if(citations[0]>citations.length){
            answer = citations.length;
        }
        
        for(int i=0;i<citations.length;i++){
            
            if(citations.length-i>=citations[i]){
                answer = Math.max(citations[i],citations.length-i-1);
            }
            else{
                break;
            }
            
        }
        
        
        return answer;
    }
}