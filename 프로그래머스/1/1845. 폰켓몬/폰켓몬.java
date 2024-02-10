import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> tmp = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            
            tmp.add(nums[i]);
            
        }
        
        answer = Math.min(tmp.size(),nums.length/2);
        
        return answer;
    }
}