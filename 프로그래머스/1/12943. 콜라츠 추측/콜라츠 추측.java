class Solution {
    public int solution(int num) {
        int answer = 0;
        
        long longNum = num;
        
        while(true){
            
            if(longNum==1){
                break;
            }
            
            if(longNum%2==0){
                longNum = longNum/2;
            }
            else{
                longNum = longNum*3 + 1;
            }
            
            answer += 1;      
            
        }
        
        if(answer > 500){
            return -1;
        }
        
        return answer;
    }
}