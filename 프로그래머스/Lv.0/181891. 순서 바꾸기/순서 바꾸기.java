class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for(int i=0; i<answer.length; i++){
            if(n+i<answer.length){
                answer[i] = num_list[n+i];
            }
            else if(n+i>=answer.length){
                answer[i] = num_list[i-(answer.length-n)];
            }
        }
    
  
        
        return answer;
    }
}