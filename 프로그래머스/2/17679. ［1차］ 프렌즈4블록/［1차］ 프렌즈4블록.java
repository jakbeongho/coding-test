import java.util.*;

class Solution {
    
    public char[][] block;
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
    
        makeBlock(board,m,n);
        
        while(true){
            boolean delete = deleteBlock();
            if(!delete){
                break;
            }
            int tmp = countDeleteBlock();
            System.out.println(tmp);
            downBlock();
            tmp = countDeleteBlock();
        }
        
        answer = countDeleteBlock();
        
        return answer;
    }
    
    public void makeBlock(String[] board,int m,int n){
        
        block = new char[m][n];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length();j++){
                block[i][j] = board[i].charAt(j);
            }
        }
        
    }
    
    public boolean deleteBlock(){
        
        boolean delete = false;
        
        char[][] tmpBlock = new char[block.length][];
            for (int i = 0; i < block.length; i++) {
                tmpBlock[i] = Arrays.copyOf(block[i], block[i].length);
            }
        
        for(int i=0;i<block.length-1;i++){
            for(int j=0;j<block[i].length-1;j++){
                if(block[i][j]!='0'&&block[i][j]==block[i+1][j]&&block[i][j]==block[i][j+1]&&block[i][j]==block[i+1][j+1]){
                    tmpBlock[i][j]='0';
                    tmpBlock[i][j+1]='0';
                    tmpBlock[i+1][j]='0';
                    tmpBlock[i+1][j+1]='0';
                    delete=true;
                }
            }
        }
        
        block = tmpBlock;
        
        return delete;
    }
    
    public void downBlock(){
        
        for(int i=block.length-1;i>0;i--){
            for(int j=0;j<block[i].length;j++){
                if(block[i][j]=='0'){
                    for(int k=i-1;k>=0;k--){
                        if(block[k][j]!='0'){
                            block[i][j]=block[k][j];
                            block[k][j]='0';
                            break;
                        }
                    }  
                }
            }
        }  
    }
    
    public int countDeleteBlock(){
        
        int count =0;
        
        for(int i=0;i<block.length;i++){
            for(int j=0;j<block[i].length;j++){
                if(block[i][j]=='0'){
                   count+=1;
                }
            }
        } 
        
        return count;
    }
    
}