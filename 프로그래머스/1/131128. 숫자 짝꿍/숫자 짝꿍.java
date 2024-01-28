import java.util.*;

class Solution {
    public String solution(String X, String Y) {
       
        String answer = "";
        StringBuilder answerbuilder = new StringBuilder();

        int[] Xbox = new int[10];
        int[] Ybox = new int[10];
        
        for(int i=0;i<X.length();i++){
            Xbox[X.charAt(i)-48] = Xbox[X.charAt(i)-48] + 1;
        }
        
        for(int i=0;i<Y.length();i++){
            Ybox[Y.charAt(i)-48] = Ybox[Y.charAt(i)-48] + 1;
        }
        
        for(int i=9;i>=0;i--){
            while(Math.min(Xbox[i],Ybox[i])>=1){
                Xbox[i] = Xbox[i] -1;
                Ybox[i] = Ybox[i] -1;
                answerbuilder.append(i);
            }
        }
        
        answer = answerbuilder.toString();
        
        if(answer.equals("")){
            return "-1";
        }
        else if(answer.charAt(0)=='0'){
            return "0";
        }
        else{
            return answer;
        }
        
    }
}