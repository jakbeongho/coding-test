class Solution {
    public int solution(String s) {
        int answer = 1;

        char tmp = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if(count == 0){
                answer++;
                tmp = s.charAt(i);
            }

            if(tmp == s.charAt(i)){
                count++;
            }
            else{
                count--;
            }
        }

        return answer;
    }
}