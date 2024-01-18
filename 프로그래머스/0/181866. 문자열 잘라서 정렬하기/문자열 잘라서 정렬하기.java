import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = Arrays.stream(myString.split("x"))
                                .filter(s -> !s.isEmpty())
                                .toArray(String[]::new);
        
        Arrays.sort(answer);
        
        
        return answer;
    }
}