import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer=-1;
        char[] beforeArray=before.toCharArray();    
        char[] afterArray=after.toCharArray();     
        
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);                  
        
        if(Arrays.equals(beforeArray, afterArray)) {      
                answer=1;                   
            } else {                       
                answer=0;                   
            }
        return answer;
    }
}
