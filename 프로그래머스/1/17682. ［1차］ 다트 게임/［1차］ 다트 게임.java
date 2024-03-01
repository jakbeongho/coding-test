class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        char[] charDart = dartResult.toCharArray();
        
        StringBuilder scoreBuilder = new StringBuilder();
        
        int round = 0;
    
        int[] scoreBoard = new int[4]; 
        
        for(int i=0;i<charDart.length;i++){
            
            if(charDart[i]>= '0' && charDart[i] <= '9'){
                scoreBuilder.append(charDart[i]);
            }
            
            if(charDart[i]=='S'||charDart[i]=='D'||charDart[i]=='T'){
                
                round++;
                
                int score = Integer.parseInt(scoreBuilder.toString());
                
                switch(charDart[i]){
                        
                    case 'S':
                        scoreBoard[round] = (int)Math.pow(score,1);
                        break;
                    case 'D':
                        scoreBoard[round] = (int)Math.pow(score,2);
                        break;
                    case 'T':
                        scoreBoard[round] = (int)Math.pow(score,3);
                        break;
                        
                }
                
                scoreBuilder.setLength(0);
            }
            
            if(charDart[i]=='*'||charDart[i]=='#'){
                
                 switch(charDart[i]){
                 
                    case '*':
                         scoreBoard[round] *= 2;
                         scoreBoard[round-1] *= 2;
                         break;
                    
                    case '#':
                         scoreBoard[round] *= -1;
                         break; 
                         
                 }
                
            }
            
        }
        
        for(int i=0;i<scoreBoard.length;i++){
            answer += scoreBoard[i];
        }
        
        return answer;
    }
}