class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String temp = Integer.toString(num);
        
        char c = (char) (48+k);
        
        if(temp.indexOf(c)==-1){
            return -1;
        }
        answer = temp.indexOf(c)+1;
        
        return answer;
    }
}