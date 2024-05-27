class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String temp = Integer.toString(order);
        
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)=='3'||temp.charAt(i)=='6'||temp.charAt(i)=='9'){
                answer++;
            }
        }
        
        return answer;
    }
}