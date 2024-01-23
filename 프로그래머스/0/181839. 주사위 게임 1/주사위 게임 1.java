class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(a*b%2==1){
            answer = (a*a) + (b*b);
        }
        else if((a+b)%2==1){
            answer = 2*(a+b);
        }
        else{
            answer = Math.abs(a-b);
        }
        
        return answer;
    }
}