class Solution {
    public int solution(int n) {
        int answer = 0;
        int one = countOne(n);
        
        while(true){
            n = n+1;
            
            if(one == countOne(n)){
                answer = n;
                break;
            }
            
        }
        
        return answer;
    }
    
    public int countOne(int n){
        
        int count =0;
        
        while(n>0){
            
            int tmp = n%2;
            
            if(tmp == 1){
                count++;
            }
            
            n /= 2;
            
        }
        
        return count;
        
    }
    
}