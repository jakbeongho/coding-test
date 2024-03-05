class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int fingerL = 10;
        int fingerR = 11;
        
        StringBuilder answerBuilder = new StringBuilder();
        
        for(int i=0;i<numbers.length;i++){
            
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7){
                answerBuilder.append("L");
                fingerL = numbers[i];
            }
            else if(numbers[i]==3||numbers[i]==6||numbers[i]==9){
                answerBuilder.append("R");
                fingerR = numbers[i];
            }
            else{
                
                int left = distance(fingerL,numbers[i]);
                int right = distance(fingerR,numbers[i]);
                
                if(left<right){
                    answerBuilder.append("L");
                    fingerL = numbers[i];
                }
                else if(right<left){  
                    answerBuilder.append("R");
                    fingerR = numbers[i];
                }
                else if(right==left){
    
                    if(hand.equals("right")){
                        answerBuilder.append("R");
                        fingerR = numbers[i];
                    }
                    else if(hand.equals("left")){
                        answerBuilder.append("L");
                        fingerL = numbers[i];
                    }
                }
            }
        }
        
        answer = answerBuilder.toString();
        
        return answer;
        
    }
    
    public int distance(int finger, int number){
        
        int[][] keyPad = {{2,4},{1,1},{2,1},{3,1},{1,2},{2,2},{3,2},{1,3},{2,3},{3,3},{1,4},{3,4}};
        
        return Math.abs(keyPad[finger][0]-keyPad[number][0])+Math.abs(keyPad[finger][1]-keyPad[number][1]);
        
    }
   
}