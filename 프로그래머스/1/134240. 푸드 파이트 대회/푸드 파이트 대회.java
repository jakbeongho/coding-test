class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder halfAnswer = new StringBuilder();
        
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                halfAnswer.append(i);
            }
        }
        
        answer = halfAnswer.toString() + "0" + halfAnswer.reverse().toString();
        
       
        
        return answer;
    }
}