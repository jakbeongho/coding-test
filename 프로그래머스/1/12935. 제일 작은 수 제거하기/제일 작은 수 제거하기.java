import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = new int[arr.length-1];
        
        int min = arr[0];
        int minIndex = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
        }
        
        for(int i=0;i<answer.length;i++){
            
            if(minIndex>i){
                answer[i] = arr[i];
            }
            else if(minIndex<=i){
                answer[i] = arr[i+1];
            }
        }
        
        if(answer.length==0){
            return new int[]{-1} ;
        }
        
        return answer;
    }
}