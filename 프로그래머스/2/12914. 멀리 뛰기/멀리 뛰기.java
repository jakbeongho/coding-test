class Solution {
    public long solution(int n) {
        long answer = 0;
        
        int first = 1;
        int second = 1;
        
        for(int i=2;i<=n;i++){
            
            int tmp = first%1234567;
            first = (first + second)%1234567;
            second = tmp;
        
        }
        
        answer = (long) first;
        
        return answer;
    }
}