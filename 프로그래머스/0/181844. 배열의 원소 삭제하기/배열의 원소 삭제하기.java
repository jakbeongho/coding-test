import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
       
        
        List<Integer> tmpList = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            tmpList.add(arr[i]);
        }
        
        for(int i=0;i<delete_list.length;i++){

            if(tmpList.indexOf(delete_list[i])!=-1){
                tmpList.remove(tmpList.indexOf(delete_list[i]));
            }
            
     
        }
        
        int[] answer = new int[tmpList.size()];
        
        for (int i = 0; i < tmpList.size(); i++) {
            answer[i] = tmpList.get(i);
        }
        return answer;
        
        
    }
}