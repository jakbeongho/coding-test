class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zeroCount = 0;
        int winCount = 0;
        
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                zeroCount += 1;    
            }
            else{
                for(int j=0;j<win_nums.length;j++){
                    if(lottos[i]==win_nums[j]){
                        winCount += 1;
                    }
                }
            }
            
        }
        
        answer[0] = Math.min(7 - (winCount+zeroCount),6);
        answer[1] = Math.min(7 - winCount,6);

        
        return answer;
    }
}