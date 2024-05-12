class Solution {
    public int solution(String str1, String str2) {
        int answer = 1;
        
        if(str1.indexOf(str2)==-1){
            answer = 2;
        }
        
        return answer;
    }
}