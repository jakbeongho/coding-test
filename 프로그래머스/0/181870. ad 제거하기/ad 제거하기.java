import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        List<String> tmplist = new ArrayList<>();
        
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].contains("ad")){
                tmplist.add(strArr[i]);
            }
        }
        
        answer = tmplist.toArray(new String[0]);
        
        return answer;
    }
}