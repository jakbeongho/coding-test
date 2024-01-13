class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
 
        for(int i=0;i<queries.length;i++){
            
            for(int j=0; j<arr.length;j++){
                if(queries[i][0] <= j && j <= queries[i][1]){
                    arr[j] += 1;
                    
                }
               
            }
            
        }
        
        answer = arr;
        
        return answer;
    }
}