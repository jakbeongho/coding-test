import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        
        List<Integer> tmpList = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(tmpList.size()==0){
                tmpList.add(arr[i]);
            }
            else if(tmpList.get(tmpList.size()-1)==arr[i]){
                tmpList.remove(tmpList.size()-1);
            }
            else if(tmpList.get(tmpList.size()-1)!=arr[i]){
                tmpList.add(arr[i]);
            }
        }
        
        int[] answer = new int[tmpList.size()];
        
        for(int i=0;i<tmpList.size();i++){
            answer[i] = tmpList.get(i);
        }
        
        if(answer.length==0){
            return new int[]{-1};
        }
        
        return answer;
    }
}