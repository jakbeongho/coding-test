import java.util.*;

class Solution {

    public boolean[] useNumber;
    public Set<Integer> primeSet = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        String[] numberArray = new String[numbers.length()];
        useNumber = new boolean[numbers.length()];
        
        for(int i=0;i<numbers.length();i++){
            numberArray[i] = Character.toString(numbers.charAt(i));
        }
        
        dfs(numberArray,"",0);
        
        answer = primeSet.size();
        
        return answer;
    }
    
    public void dfs(String[] numberArray, String number,int depth){
        
        if(depth==numberArray.length){
            return;
        }
        
        for(int i=0;i<numberArray.length;i++){
            
            if(useNumber[i]){
                continue;
            }
            
            useNumber[i] = true;
            
            String strNumber = number + numberArray[i];
            
            int temp = Integer.parseInt(strNumber);
            
            if(checkPrime(temp)){
                primeSet.add(temp);
            }
            
            dfs(numberArray,strNumber,depth+1);
            
            useNumber[i] = false;
        }
        
    }
        
    public boolean checkPrime(int number){
        
        boolean result = true;
        
        if(number==0 || number==1){
            return false;
        }
        
        if(number==2 || number==3){
            return true;
        }
        
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        
        return result;
        
    }    
}