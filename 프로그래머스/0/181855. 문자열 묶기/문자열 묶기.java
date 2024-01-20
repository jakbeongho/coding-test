import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        Map<Integer, Integer> tmp = new HashMap<>();
        
        for(int i=0;i<strArr.length;i++){
            tmp.put(strArr[i].length(), tmp.getOrDefault(strArr[i].length(),0)+1);
        }
        
        
        
        
        for (Map.Entry<Integer, Integer> entry : tmp.entrySet()) {
            int value = entry.getValue();
            
            if (value >answer) {
                answer = value;
            }
        }
        
        
        return answer;
    }
}