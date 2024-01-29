class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++){
            
            StringBuilder tmp = new StringBuilder();
            
            String arr1box = ChangeBinary(n,arr1[i]);
            String arr2box = ChangeBinary(n,arr2[i]);
            
            for(int j=0;j<n;j++){
                if(arr1box.charAt(j)=='1' || arr2box.charAt(j)=='1'){
                    tmp.append("#");
                }
                else{
                    tmp.append(" ");
                }
            }
            
            answer[i] = tmp.toString();
        }
        
        
        return answer;
    }
    
    public String ChangeBinary(int n, int base){
        
        StringBuilder Changer = new StringBuilder();
        
        for(int i=1;i<=n;i++){
            if(base-Math.pow(2, (n - i))>=0){
                Changer.append("1");
                base -= Math.pow(2,(n - i));
            }
            else{
                Changer.append("0");
            }
        }
        
        return Changer.toString();
    }
    
}