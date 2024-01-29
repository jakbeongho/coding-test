class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left;i<=right;i++){
            int tmp =(int)Math.sqrt(i)* (int) Math.sqrt(i);
            
            if(tmp == i){
                answer -= i;
            }
            else {
                answer += i;
            }
        }
        
        return answer;
    }
}