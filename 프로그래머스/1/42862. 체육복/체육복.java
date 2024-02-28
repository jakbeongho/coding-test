import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
                
        Set<Integer> uniform = new HashSet<>();
        List<Integer> realLost = new ArrayList<>();
        
        Arrays.sort(lost);
        
        for(int i=0;i<reserve.length;i++){
            uniform.add(reserve[i]);
        }
        
        for(int i=0;i<lost.length;i++){
            
            if(!uniform.contains(lost[i])){
                realLost.add(lost[i]);
            }
            else{
                uniform.remove(lost[i]);
            }
            
        }
        
        answer = n-realLost.size();
        
       
        for(int i=0;i<realLost.size();i++){
         
            if(uniform.contains(realLost.get(i)-1)){
                answer++;
                uniform.remove(realLost.get(i)-1);
            }
            else if(uniform.contains(realLost.get(i)+1)){
                answer++;
                uniform.remove(realLost.get(i)+1);
            }
            
        }
        
        return answer;
    }
}