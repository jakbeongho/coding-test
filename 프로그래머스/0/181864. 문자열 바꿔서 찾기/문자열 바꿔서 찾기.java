
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
                String result = "";

        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if(c == 'A'){
                result += "B";
            } else {
                result += "A";
            }
        }
        if(result.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}