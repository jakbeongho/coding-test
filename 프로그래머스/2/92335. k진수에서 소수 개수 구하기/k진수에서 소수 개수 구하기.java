class Solution {
    
    public int solution(int n, int k) {
        int answer = 0;
        
        String nString = Integer.toString(n,k);
        
        System.out.println(nString);
        
        String[] nArray = nString.split("0");
        
        for(int i=0;i<nArray.length;i++){
           
            
            if(nArray[i].equals("")){
                continue;
            }
            
            
            if(isPrime(Long.parseLong(nArray[i]))){
                answer += 1;
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(long x){        
        
        if(x==1){
            return false;
        }
        
        if(x==2){
            return true;
        }
        
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
            
        }
        return true;
    }
}