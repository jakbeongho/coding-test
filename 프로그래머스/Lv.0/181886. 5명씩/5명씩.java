import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        
        
        int tmp = (int) Math.ceil((double) names.length/5);
        
        String[] answer = new String[tmp];
        
        for(int i=0; i<tmp; i++){
            answer[i] = names[i*5];    
        }
        
        
        return answer;
    }
}