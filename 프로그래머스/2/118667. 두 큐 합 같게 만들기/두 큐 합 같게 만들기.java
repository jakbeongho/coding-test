import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        long totalSum = 0;
        long SumQueue1 = 0;
        long SumQueue2 = 0;
        int length = queue1.length + queue2.length;
        
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();
         
        for(int value : queue1){
            SumQueue1 += value;
            Q1.offer(value);
        }
        
         for(int value : queue2){
            SumQueue2 += value;
            Q2.offer(value);
        }
        
        totalSum = SumQueue1 + SumQueue2;
        
        if(totalSum%2==1){
            return -1;
        }
        
        long SameValue = totalSum/2;
        
        while(SumQueue1!=SameValue){
            
            if(answer>length+1){
                return -1;
            }
            
            if(SumQueue1>SameValue){
                int temp = Q1.poll();
                SumQueue1-=temp;
                Q2.offer(temp);
            }
            else if(SumQueue1<SameValue){
                int temp = Q2.poll();
                SumQueue1+=temp;
                Q1.offer(temp);
            }
            
            answer+=1;
        }
        
        return answer;
    }
}