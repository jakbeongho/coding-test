import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
     
        List<String> cache = new ArrayList<>();
        
        if(cacheSize==0){
            return 5 * cities.length;
        }
        
        for(int i=0;i<cities.length;i++){
            
            String temp = cities[i].toUpperCase();
            
            if(cache.contains(temp)){
                cache.remove(temp);
                cache.add(temp);
                answer += 1;
            }
            else{
                if(cache.size()==cacheSize){
                    cache.remove(0);
                    cache.add(temp);
                    answer += 5;
                }
                else{
                    cache.add(temp);
                    answer += 5; 
                }
            } 
        }
        
        return answer;
    }
}