import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] tmp = s.toCharArray();

        
        Arrays.sort(tmp);

        
        answer = new StringBuilder(new String(tmp)).reverse().toString();
        
        
        return answer;
    }
}