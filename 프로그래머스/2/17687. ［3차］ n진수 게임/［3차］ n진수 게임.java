class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        StringBuilder answerBuilder = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        
        for(int i=0;tmp.length() < t*m;i++){
            tmp.append(Integer.toString(i,n));
        }
        
        
        for(int i= p-1; answerBuilder.length() < t;i +=m){
            answerBuilder.append(tmp.charAt(i));
        }
        
        answer = answerBuilder.toString().toUpperCase();
        
        return answer;
    }
}