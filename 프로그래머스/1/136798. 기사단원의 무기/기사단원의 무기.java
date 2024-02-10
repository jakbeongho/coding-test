class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i=1;i<=number;i++){
            int tmp = count(i);
            
            if(tmp>limit){
                answer += power;
            }
            else{
                answer += tmp;
            }
          
        }
        
        return answer;
    }
    
    public int count(int n){
        int tmp = 0;
        
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                tmp += 2;
            
                if(n/i==i){
                    tmp -= 1;
                }
            }
        }   
        return tmp;
    }
}