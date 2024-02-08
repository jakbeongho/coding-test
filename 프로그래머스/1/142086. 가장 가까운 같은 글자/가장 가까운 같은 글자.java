import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character,Integer> tmp = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(!tmp.containsKey(s.charAt(i))){
                answer[i] = -1;
                tmp.put(s.charAt(i),i);
            }
            else{
                answer[i] = i - tmp.get(s.charAt(i));
                tmp.put(s.charAt(i),i);
            }
        }
        
        
        return answer;
    }
}