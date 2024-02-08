class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int deleteZero = 0;
        
        int count = 0;
        
        System.out.println(s.replace("0",""));
        
        
        while(!s.equals("1")){
            int tmp = s.length();
            
            s = s.replace("0","");
            
            int tmp2 = s.length();
            
            s = Integer.toBinaryString(s.length());
            
            deleteZero += tmp-tmp2;
            count++;
          
        }
        
        answer[0] = count;
        answer[1] = deleteZero;
        
        return answer;
    }
    

}