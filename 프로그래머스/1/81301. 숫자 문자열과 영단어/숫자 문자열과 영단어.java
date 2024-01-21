class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char[] charS = s.toCharArray();
        
        StringBuilder ChangeWord = new StringBuilder();
        StringBuilder StringAnswer = new StringBuilder();
        
        for(int i=0; i<charS.length;i++){
            
            int tmp=0;
            tmp = (int) charS[i];
            
            if(48<=tmp && tmp<=57){
                StringAnswer.append(charS[i]);
            }
            else if(97<=tmp && tmp<=122){
                ChangeWord.append(charS[i]);
                
                switch (ChangeWord.toString()){
                    case "zero":
                        StringAnswer.append(0);
                        ChangeWord.setLength(0);
                        break;
                    case "one":
                        StringAnswer.append(1);
                        ChangeWord.setLength(0);
                        break;
                    case "two":
                        StringAnswer.append(2);
                        ChangeWord.setLength(0);
                        break;
                    case "three":
                        StringAnswer.append(3);
                        ChangeWord.setLength(0);
                        break;
                    case "four":
                        StringAnswer.append(4);
                        ChangeWord.setLength(0);
                        break;
                    case "five":
                        StringAnswer.append(5);
                        ChangeWord.setLength(0);
                        break;
                    case "six":
                        StringAnswer.append(6);
                        ChangeWord.setLength(0);
                        break;
                    case "seven":
                        StringAnswer.append(7);
                        ChangeWord.setLength(0);
                        break;
                    case "eight":
                        StringAnswer.append(8);
                        ChangeWord.setLength(0);
                        break;
                    case "nine":
                        StringAnswer.append(9);
                        ChangeWord.setLength(0);
                        break;
                    default :
                        break;
                }
                
            }
            
        }
        
        answer = Integer.parseInt(StringAnswer.toString());
        
        
        return answer;
    }
}