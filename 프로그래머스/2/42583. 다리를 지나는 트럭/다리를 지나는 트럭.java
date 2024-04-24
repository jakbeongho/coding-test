import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> bridge = new LinkedList<>();
        
        int totalWeight = 0; 
        int time = 0;
        
        for(int i=0;i<truck_weights.length;i++) {
            while(true) {
                if(bridge.isEmpty()) { 
                    bridge.add(truck_weights[i]);
                    totalWeight += truck_weights[i];
                    time+=1;
                    break;
                }
                else if(bridge.size() == bridge_length) {
                    totalWeight -= bridge.poll();
                } 
                else{
                    if(totalWeight+truck_weights[i] <= weight) {
                        bridge.add(truck_weights[i]);
                        totalWeight += truck_weights[i];
                        time+=1;
                        break;
                    } else {
                        bridge.add(0);
                        time+=1;
                    }
                }
            }
        }
        
        answer = time+bridge_length;
        
        return answer;
    }
}