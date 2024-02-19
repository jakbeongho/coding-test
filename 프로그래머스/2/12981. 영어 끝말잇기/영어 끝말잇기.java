import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0,0};

        char last = words[0].charAt(words[0].length()-1);
        
        HashSet<String> wordSet = new HashSet<>();
        wordSet.add(words[0]);
        
        for(int i=1;i<words.length;i++){
               
            if(!wordSet.add(words[i])){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            
            if(last!=words[i].charAt(0)){
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            wordSet.add(words[i]);
            last = words[i].charAt(words[i].length()-1);
        }
        
        return answer;
    }
}