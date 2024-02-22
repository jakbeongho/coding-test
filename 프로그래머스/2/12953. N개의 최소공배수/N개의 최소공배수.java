import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        Arrays.sort(arr);
        
        int count=1;
        int max=arr[arr.length-1];
        
        while(true){
            
            boolean check = true;
            
            for(int i=0;i<arr.length;i++){
            
                if(max*count%arr[i]!=0){
                    check=false;
                    break;
                }
                
            } 
            
            if(check){
                break;
            }
            
            count++; 
            
        }
        
        answer = count * max;
        
        return answer;
    }
}