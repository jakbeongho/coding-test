class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder Changer = new StringBuilder();
        
        while(n > 0){
            int tmp = n % 3;
            
            Changer.append(tmp);
            
            n = n/3;
        }
        
        int Changer2 = 1;
        
        for (int i = Changer.length()-1; i>=0; i--){
            int tmp = Changer.charAt(i) - '0';
            
            answer += tmp * Changer2;
            
            Changer2 = Changer2 * 3;
            
        }
        
        return answer;
    }
}