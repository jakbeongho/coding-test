class Solution {
    public String solution(int age) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        String strAge = Integer.toString(age);
        
        for(int i=0;i<strAge.length();i++){
            
            char tmp = (char)(strAge.charAt(i)+49);
            
            sb.append(tmp);
        }
        
        answer = sb.toString();
        
        return answer;
    }
    
}