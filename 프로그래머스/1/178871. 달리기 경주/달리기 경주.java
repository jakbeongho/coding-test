import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
 
        Map<String,Integer> rank = new HashMap<>();
        
        for(int i=0;i<players.length;i++){
            
            rank.put(players[i],i+1);
            
        }
        
        
        for(int i=0;i<callings.length;i++){
            
            String tmp = players[rank.get(callings[i])-2];
            players[rank.get(callings[i])-2] = players[rank.get(callings[i])-1];
            players[rank.get(callings[i])-1] = tmp;
            
            rank.put(callings[i],rank.get(callings[i])-1);
            rank.put(tmp,rank.get(tmp)+1);
            
        }
        
        return players;
    }
}