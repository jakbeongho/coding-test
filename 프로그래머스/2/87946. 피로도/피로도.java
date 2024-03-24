class Solution {
    
    public int answer;
    public boolean[] clear;
    
    public int solution(int k, int[][] dungeons) {
        
        clear = new boolean[dungeons.length];
        
        allfind(0, k, dungeons);
        
        return answer;
    }
    
    public void allfind(int count,int k,int[][] dungeons){
        
        for(int i=0;i<dungeons.length;i++){
            if(!clear[i] && k >= dungeons[i][0]){
                clear[i] = true;
                allfind(count+1,k - dungeons[i][1], dungeons);
                clear[i] = false;
            }
        }
        
        answer = Math.max(answer,count);
    }
    
}