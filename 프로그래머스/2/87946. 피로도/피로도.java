class Solution {
    
    boolean[] clear;
    int count =0;
    
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        clear = new boolean[dungeons.length];
        
        dfs(dungeons,0,k);
        
        answer = count;
        
        return answer;
    }
    
    public void dfs(int[][] dungeons,int depth, int k){
        
        for(int i=0;i<dungeons.length;i++){
            
            if(k>=dungeons[i][0] && !clear[i]){
                clear[i] = true;
                dfs(dungeons,depth+1,k-dungeons[i][1]);
                clear[i] = false;
            }
            
        }
        
        count = Math.max(count,depth);
        
    }
}