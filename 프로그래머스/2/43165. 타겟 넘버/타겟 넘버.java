class Solution {
    
    int count = 0;
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        dfs(numbers, target, 0, 0);
        
        answer = count;
        
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int sum, int depth){
        
        if(depth==numbers.length){
            
            if(sum==target){
                count+=1;
            }
          
        }
        else{
            dfs(numbers,target,sum+numbers[depth],depth+1);
            dfs(numbers,target,sum-numbers[depth],depth+1);
        }
        
    }
}