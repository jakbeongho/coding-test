class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        char alpp = alp.charAt(0);
        
        char before = alpp;
        char after =(char)((int)alpp-32);
        
        answer = my_string.toLowerCase().replace(before,after);
        
        return answer;
    }
}