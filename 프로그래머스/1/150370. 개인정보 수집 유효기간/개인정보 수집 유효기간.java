import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
       
        
        List<Integer> answerList = new ArrayList<>();
        
        String[] todayCut = today.split("\\.");
        
        int todayInt = Integer.parseInt(todayCut[0])*12*28 
                        + Integer.parseInt(todayCut[1])*28
                        + Integer.parseInt(todayCut[2]);
        
        Map<Character,Integer> termsMap = new HashMap<>();
        
        for(int i=0;i<terms.length;i++){
            
            termsMap.put(terms[i].charAt(0),Integer.parseInt(terms[i].substring(2)));
            
        }
        
        for(int i=0;i<privacies.length;i++){
            
            int deleteDay = Integer.parseInt(privacies[i].substring(0,4))*12*28
                            +Integer.parseInt(privacies[i].substring(5,7))*28
                            +Integer.parseInt(privacies[i].substring(8,10))
                            +termsMap.get(privacies[i].charAt(privacies[i].length()-1))*28;
            
            System.out.println(deleteDay+"/"+todayInt);
            
            if(deleteDay<=todayInt){
                answerList.add(i+1);
            }
            
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
} 