class Solution {
    public int solution(int n) {
        int answer = 0;
        
        long num1 = 1;
        long num2 = 1;
        
        for(int i=3;i<=n;i++){
            
            long tmp = num1;
            num1 = num2%1234567 + num1%1234567;
            num2 = tmp;
        
        }
        
        answer = (int)num1%1234567;
        
        return answer;
    }
}