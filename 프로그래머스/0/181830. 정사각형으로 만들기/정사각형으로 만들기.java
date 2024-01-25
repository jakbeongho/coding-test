class Solution {
    public int[][] solution(int[][] arr) {
        int size = Math.max(arr.length,arr[0].length);

        int[][] answer = new int[size][size];
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                if(arr.length <= i){
                    answer[i][j] = 0;
                    continue;
                }
                if(arr[i].length <= j){
                    answer[i][j] = 0;
                    continue;
                }
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}