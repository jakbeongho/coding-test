class Solution {
    public int solution(int n) {
        int answer = 0;
        
        double sqrt = Math.sqrt(n);
    
        int tmp = (int) sqrt;
        
        if(tmp*tmp==n){
            answer = 1;
        }
        else{
            answer = 2;
        }
        
        return answer;
    }
}