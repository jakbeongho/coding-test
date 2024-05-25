class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<my_string.length();i++){
            
            char c = my_string.charAt(i);
            
            if(65<=c&&c<=90){
                sb.append(Character.toLowerCase(c));
            }
            else if(97<=c&&c<=122){
                sb.append(Character.toUpperCase(c));
            }
            
        }
        
        answer = sb.toString();
        
        return answer;
    }
}