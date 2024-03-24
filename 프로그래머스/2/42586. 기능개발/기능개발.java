import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> completeDay = new LinkedList<>();
        
        for(int i=0;i<progresses.length;i++){
            completeDay.add((int)(Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        while(!completeDay.isEmpty()){
            
            int day = completeDay.poll();
            int count = 1;
            
            while(!completeDay.isEmpty()&&day>=completeDay.peek()){
              
                count += 1;
                completeDay.poll();
            }
            answerList.add(count);
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}
