class Solution {
    
    public int count=0;
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        dfs(numbers,target,0,0);
        
        answer = count;
        
        return answer;
        
    }
    
    public void dfs(int[] numbers,int target,int index,int result){
        if(index == numbers.length){
            if(result == target){
                count += 1;
            }
        }
        else{
            dfs(numbers,target,index+1,result+numbers[index]);
            dfs(numbers,target,index+1,result-numbers[index]);
        }
        
    }
    
    
}