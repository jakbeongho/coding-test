import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(String s) {
       
        String[] firstArray = s.replaceAll("\\{\\{|\\}\\}", "").split("\\},\\{");
        
        int[] answer = new int[firstArray.length];
        
        Set<Integer> check = new HashSet<>();
        
        Arrays.sort(firstArray, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        
        for(int i=0;i<firstArray.length;i++){
            
            String[] secondArray = firstArray[i].split(",");
            
            for(int j=0;j<secondArray.length;j++){
                if(check.add(Integer.parseInt(secondArray[j]))){
                    answer[i] = Integer.parseInt(secondArray[j]);
                    break;
                }
            }
        }
        
        return answer;
    }
}