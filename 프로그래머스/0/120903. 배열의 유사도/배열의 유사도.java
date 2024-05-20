import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        Set<String> tmp = new HashSet<>();
        
        for(String str : s1){
            tmp.add(str);
        }
        
        for(String str : s2){
            if(!tmp.add(str)){
                answer++;
            }
        }
        
        return answer;
    }
}