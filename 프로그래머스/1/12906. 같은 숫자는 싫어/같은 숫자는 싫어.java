import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> tmp = new Stack<>();
        
        tmp.push(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(tmp.peek() != arr[i]){
                tmp.push(arr[i]);
            }
        }
        
        int[] answer = new int[tmp.size()];
        
        for(int i=tmp.size()-1;i>=0;i--){
            answer[i] = tmp.pop();
        }
        
        return answer;
    }
}