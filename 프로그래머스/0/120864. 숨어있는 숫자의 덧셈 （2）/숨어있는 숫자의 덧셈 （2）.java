class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] number = my_string.split("[a-zA-Z]+");
        
        for(String s : number){
            if (!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}