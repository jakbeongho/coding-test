import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
       
        
        List<Integer> tmpList = new ArrayList<>();
        
        
        for(int i=0; i<arr.length;i++){
            
            if(flag[i]){
                for(int j=0;j<arr[i]*2;j++){
                    tmpList.add(arr[i]);
                }
            }
            else{
                tmpList = tmpList.subList(0,tmpList.size()-arr[i]);
            }
            
            
        }
        
        
        int[] answer = tmpList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}