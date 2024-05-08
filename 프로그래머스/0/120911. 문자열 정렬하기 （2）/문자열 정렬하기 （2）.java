import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String str = my_string.toLowerCase();
        
        char[] charArray = str.toCharArray();
        
        Arrays.sort(charArray);

        answer = new String(charArray);
        
        return answer;
    }
}