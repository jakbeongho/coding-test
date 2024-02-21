import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 1;
        
        Map<Integer, Integer> gyul = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            gyul.put(tangerine[i], gyul.getOrDefault(tangerine[i], 0) + 1);
        }    
        
        List<Map.Entry<Integer, Integer>> gyulList = new ArrayList<>(gyul.entrySet());

        gyulList.sort(Collections.reverseOrder(Map.Entry.comparingByValue())); 

        for (Map.Entry<Integer, Integer> entry : gyulList) {
       
            int gyulCount = entry.getValue();
            
            if(k>gyulCount){
                k = k-gyulCount;
                answer++;
            }
            else{
                break;
            }
        
        }
        
        return answer;
    }
}