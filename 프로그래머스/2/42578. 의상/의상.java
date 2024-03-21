import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String,Integer> clothesMap = new HashMap<>();
        
        for(int i=0;i<clothes.length;i++){
            
            clothesMap.put(clothes[i][1],clothesMap.getOrDefault(clothes[i][1],0)+1);
            
        }
        
        List<String> keySet = new ArrayList<>(clothesMap.keySet());
        
        for(int i=0;i<keySet.size();i++){
            
            answer = (clothesMap.get(keySet.get(i))+1)*answer;
            
        }
        
        answer -= 1;
        
        return answer;
    }
}