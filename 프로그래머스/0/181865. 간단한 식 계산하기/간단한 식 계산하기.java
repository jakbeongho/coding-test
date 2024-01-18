class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] tmpString = binomial.split(" ");
        
        int tmp1 = Integer.parseInt(tmpString[0]);
        int tmp2 = Integer.parseInt(tmpString[2]);
        
        System.out.println(tmpString[1]);
        
        
        if(tmpString[1].equals("+")){
            answer = tmp1 + tmp2;
        }
        else if(tmpString[1].equals("-")){
            answer = tmp1 - tmp2;
        }
        else if(tmpString[1].equals("*")){
            answer = tmp1 * tmp2;
        }
        
        return answer;
    }
}