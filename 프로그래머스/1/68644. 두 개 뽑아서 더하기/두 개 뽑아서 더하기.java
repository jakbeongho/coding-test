import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
      
        
        List<Integer> tmpList = new ArrayList<>();
         
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                tmpList.add(numbers[i]+numbers[j]);
            }
        }
        
        HashSet<Integer> tmpSet = new HashSet<>(tmpList);

        
        List<Integer> resultList = new ArrayList<>(tmpSet);
        
        Collections.sort(resultList);
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        
        return answer;
    }
}