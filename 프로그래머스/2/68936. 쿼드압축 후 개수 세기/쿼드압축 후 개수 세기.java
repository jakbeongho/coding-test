class Solution {
    
    public boolean[][] compress;
    public int count1 = 0;
    public int count0 = 0;
    
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        int length = arr.length;
        
        compress = new boolean[length][length];
        
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){    
                if(arr[i][j]==0){
                    count0+=1;
                }
                else if(arr[i][j]==1){
                    count1+=1;
                }
            }
        }
        
        int compressSize = length;
        
        while(compressSize>=2){
            int[] location = new int[2];
            
            for(int i=0;i<length;i+=compressSize){
                location[0]=i;
                for(int j=0;j<length;j+=compressSize){
                    location[1]=j;
                    if(!compress[location[0]][location[1]]){
                        check(arr,compressSize,location);
                    }
                }
            }
    
            compressSize/=2;
        }
        
        answer[0] = count0;
        answer[1] = count1;
        
        return answer;
    }
    
    
    public void check(int[][] arr,int compressSize, int[] location){
        
        boolean zero = false;
        boolean one = false;
        
        for(int i=location[0];i<location[0]+compressSize;i++){
            for(int j=location[1];j<location[1]+compressSize;j++){
                if(arr[i][j]==0){
                    zero = true;
                }
                if(arr[i][j]==1){
                    one = true;
                }
                if(zero && one){
                    return;
                }
            }
        }
        
        for(int i=location[0];i<location[0]+compressSize;i++){
            for(int j=location[1];j<location[1]+compressSize;j++){
                compress[i][j] = true;        
            }
        }
        
        if(zero){
            count0 = count0 - (compressSize*compressSize)+1;
        }
        else if(one){
            count1 = count1 - (compressSize*compressSize)+1;
        }
        return;
    }
    
}