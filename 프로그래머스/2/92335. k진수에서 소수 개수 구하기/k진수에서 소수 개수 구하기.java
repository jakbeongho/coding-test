class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String k_number = Integer.toString(n,k);
        
        String[] k_number_Array = k_number.split("0");
        
        for(int i=0;i<k_number_Array.length;i++){
            
            if(k_number_Array[i].equals("")){
                continue;
            }
            
            if(check(Long.parseLong(k_number_Array[i]))){
                answer += 1;
            }
            
        }
        
        return answer;
    }
    
    public boolean check(long n){
        
        if(n<=1){
            return false;
        }
        else if(n==2){
            return true;
        }
        
        for(int i=2;i<Math.sqrt(n)+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}