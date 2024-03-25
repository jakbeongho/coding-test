import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        List<Integer> rank = new ArrayList<>();
        
        for(int i=0;i<priorities.length;i++){
            rank.add(priorities[i]);
        }
        
        Collections.sort(rank, Collections.reverseOrder());
        
        while(!rank.isEmpty()){
            for(int i=0;i<priorities.length;i++){   
                if(rank.get(0)==priorities[i]){
                    rank.remove(0);
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