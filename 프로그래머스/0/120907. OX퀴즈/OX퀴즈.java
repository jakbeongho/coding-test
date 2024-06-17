class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0;i<quiz.length;i++){
            String[] tmp = quiz[i].split(" ");
            
            if(tmp[1].equals("+")){
                int result = Integer.parseInt(tmp[0])+Integer.parseInt(tmp[2]);
                if(result==Integer.parseInt(tmp[4])){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
            else if(tmp[1].equals("-")){
                 int result = Integer.parseInt(tmp[0])-Integer.parseInt(tmp[2]);
                if(result==Integer.parseInt(tmp[4])){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
        }
        
        
        return answer;
    }
}