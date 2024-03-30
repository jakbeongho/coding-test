import java.util.*;

class Solution {
    public int[] solution(String msg) {
        
        Map<String,Integer> LZW = new HashMap<>();
        
        String[] AtoZ = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        for(int i=0;i<AtoZ.length;i++){
            LZW.put(AtoZ[i],i+1);
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        int index = 27;
        
        StringBuilder sb = new StringBuilder();
        
        int wIndex = 0;
            
        while(true){
        
            sb.append(msg.charAt(wIndex));
                
            if(LZW.containsKey(sb.toString())){
                wIndex+=1;
                
                if(wIndex>=msg.length()){
                    answerList.add(LZW.get(sb.toString()));
                    break;
                }
            }
            else{
                LZW.put(sb.toString(),index);
                sb.setLength(sb.length()-1);
                answerList.add(LZW.get(sb.toString()));
                sb.setLength(0);
                index +=1;
            }
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}