class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int lo = Math.max(sides[0],sides[1]);
        int sh = Math.min(sides[0],sides[1]);
        
        answer = (lo+sh)-(lo-sh)-1;
        
        return answer;
    }
}