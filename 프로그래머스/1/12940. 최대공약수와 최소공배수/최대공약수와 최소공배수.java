class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = 0;
        int min = 0;
        
        min = n*m;
       
        
        while(true){
            int tmp = m;
            
            m = n % m;
            n = tmp;
            
            if(m==0){
                max = n;
                break;
            }
        }
        
        min = min/max;
        
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    }
}