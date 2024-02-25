import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character,Integer> fastKeyMap = new HashMap<>();
        
        for(int i=0; i<keymap.length;i++){
            for(int j=0; j<keymap[i].length();j++){
                
                char tmp = keymap[i].charAt(j);
                
                if(fastKeyMap.containsKey(tmp)){
                    fastKeyMap.put(tmp,Math.min(fastKeyMap.get(tmp),j+1));
                }
                else{
                    fastKeyMap.put(tmp,j+1);
                }
            }
        }
        
        for(int i=0;i<targets.length;i++){
            
            int sum = 0;
            
            for(int j=0;j<targets[i].length();j++){
                
                char tmp = targets[i].charAt(j);
                
                if(fastKeyMap.containsKey(tmp)){
                    answer[i] += fastKeyMap.get(tmp);
                }
                else{
                    answer[i] = -1;
                    break;
                }
                
            }
            
        }
        
        
        return answer;
    }
}