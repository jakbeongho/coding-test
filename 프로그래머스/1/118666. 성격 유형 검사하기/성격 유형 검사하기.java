import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        String[] category = {"RT","CF","JM","AN"};
        
        Map<Character,Integer> MBTI = new HashMap<>();
        
        for(int i=0;i<category.length;i++){
            MBTI.put(category[i].charAt(0),0);
            MBTI.put(category[i].charAt(1),0);
        }
        
        for(int i=0;i<survey.length;i++){
            if(choices[i]<4){
                MBTI.put(survey[i].charAt(0),MBTI.get(survey[i].charAt(0))+Math.abs(4-choices[i]));
            }
            else if(choices[i]>4){
                MBTI.put(survey[i].charAt(1),MBTI.get(survey[i].charAt(1))+Math.abs(4-choices[i]));
            }
        }
        
        for(int i=0;i<category.length;i++){
            
            int first = MBTI.get(category[i].charAt(0));
            int second = MBTI.get(category[i].charAt(1));
        
            if(first>second){
                answer +=category[i].charAt(0);
            }
            else if(first<second){
                answer +=category[i].charAt(1);
            }
            else if(first==second){
                
                if(category[i].charAt(0)<category[i].charAt(1)){
                    answer += category[i].charAt(0);
                }
                else {
                    answer += category[i].charAt(1);
                }
                
            }
            
        }
    
        return answer;
    }
}