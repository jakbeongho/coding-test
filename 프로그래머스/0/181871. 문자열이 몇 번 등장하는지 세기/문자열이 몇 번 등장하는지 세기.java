class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i=0;i<=myString.length()-pat.length();i++){
            if(myString.substring(0+i,pat.length()+i).equals(pat)){
                answer += 1;
            }
        }
        
        return answer;
    }
}