class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int last= 0;
        
        String[] array = s.split(" ");
        
        for(String str : array){
            if(str.equals("Z")){
                answer -= last;
                continue;
            }
            
            last = Integer.parseInt(str);
            answer += Integer.parseInt(str);
            
        }
        
        return answer;
    }
}