import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] count = new int[3];
        
        for(int i=0;i<answers.length;i++){
            
            if(answers[i]==num1[i%5]){
                count[0]++;
            }
            
            if(answers[i]==num2[i%8]){
                count[1]++;
            }
            
            if(answers[i]==num3[i%10]){
                count[2]++;
            }
        }
        
        int max = 0;
    
        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                max = count[i];
            }
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int i=0;i<count.length;i++){
            if(count[i]==max){
                answerList.add(i+1);
            }
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i=0;i<answerList.size();i++){
            answer[i]= answerList.get(i);
        }        
        
        return answer;
    }
}