import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        
        ArrayList<Integer> tmpList = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                tmpList.add(arr[i]);
            }
        }
        
       int[] answer = tmpList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
        
    
    }
}