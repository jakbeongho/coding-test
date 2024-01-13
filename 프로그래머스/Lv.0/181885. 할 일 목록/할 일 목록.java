import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
       
        List<String> finish_list = new ArrayList<>();
        
        for(int i=0; i<todo_list.length; i++){
            if(finished[i]==false){
                finish_list.add(todo_list[i]);
            }
        }
        
         String[] answer = finish_list.toArray(new String[0]);
        
      
        
        return answer;
    }
}