import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> auxiliaryBelt = new Stack<>();
        auxiliaryBelt.push(0);
        
        int index=0;
        
        for(int i=0;i<order.length;i++){
        
            if(order[index]==i+1){
                index+=1;
                continue;
            }
           
            if(order[index]==auxiliaryBelt.peek()){
                index+=1;
                i-=1;
                auxiliaryBelt.pop();
                continue;
            }
            
            auxiliaryBelt.push(i+1);
            
        }
        
        for(int i=index;i<order.length;i++){
            
            if(order[i]==auxiliaryBelt.peek()){
                index+=1;
                auxiliaryBelt.pop();
            }
            else{
                break;
            }
            
        }
        
        answer = index;
        
        return answer;
    }
}