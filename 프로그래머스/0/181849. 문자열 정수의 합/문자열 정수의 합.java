class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String[] tmp = num_str.split("");
        
        for(int i=0; i<tmp.length; i++){
            answer += Integer.parseInt(tmp[i]);
        }
        
        return answer;
    }
}