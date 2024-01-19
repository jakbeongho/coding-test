import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        int[] modArr = Arrays.stream(arr).distinct().toArray();
        
        int tmp = modArr.length;
        
        for(int i=0;i<answer.length;i++){
            if(tmp != 0){
                answer[i] = modArr[i];
                tmp--;
            }
            else{
                answer[i] = -1;
            }
        }
             
        return answer;
    }
}