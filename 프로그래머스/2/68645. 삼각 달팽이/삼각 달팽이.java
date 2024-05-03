class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int[][] snail = new int[n][n];
        
        int num = 1;
        int x = 0;
        int y = -1;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                
                switch(i%3){
                    case 0: 
                        y++;
                        break;
                    case 1:
                        x++;
                        break;
                    case 2: 
                        x--;
                        y--;
                        break;
                }
                
                snail[x][y] = num;
                num++;
            }
        }
        
        answer = new int[num-1];
        
        int index = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(snail[j][i]==0){
                    break;
                }
                answer[index] = snail[j][i]; 
                index++;
            }
        }
        
        return answer;
    }
}