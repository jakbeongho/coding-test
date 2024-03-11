import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int lightPeople = 0;
        
        for(int i=people.length-1;i>=lightPeople;i--){
            if(people[i]+people[lightPeople]<=limit){
                answer++;
                lightPeople++;
            }
            else{
                answer++;
            }
        }
        
        return answer;
    
    
    }
}