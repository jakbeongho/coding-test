import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> rank = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<priorities.length;i++){
            rank.offer(priorities[i]);
        }
        
        while(!rank.isEmpty()){
            
            for(int i=0;i<priorities.length;i++){
                
                if(rank.peek()==priorities[i]){
                    rank.poll();
                    answer += 1;
                    
                    if(i==location){
                        return answer;
                    }
                    
                }
                
            }
        }
        
        
        return answer;
    }
}