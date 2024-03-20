import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        int time = bandage[0];
        int heal = bandage[1];
        int bonus = bandage[2];
        int nextattack = 0;
        int combo = 1;
        int maxHealth = health;
        
        for(int i=1;i<=attacks[attacks.length-1][0];i++){
            
            if(i==attacks[nextattack][0]){
                health -= attacks[nextattack][1];
                nextattack = Math.min(attacks.length,nextattack+1);
                combo = 0;           
            }
            else{
                combo++;
                
                if(combo==time){
                    health = Math.min(maxHealth,health+heal+bonus);
                    combo = 0;
                }
                else{
                    health = Math.min(maxHealth,health+heal);    
                }
            }
            
            
            if(health<=0){
                return -1;
            }
        }
        
        answer = health;
        
        return answer;
    }
}