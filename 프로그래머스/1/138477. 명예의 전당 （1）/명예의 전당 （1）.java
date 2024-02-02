import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> tmp = new PriorityQueue<>();
        for(int i=0; i< score.length;i++){
            tmp.add(score[i]);
            
            if(tmp.size() > k){
                tmp.poll();
            }    
        
            answer[i] = tmp.peek();
        
        }
        
        return answer;
    }
}