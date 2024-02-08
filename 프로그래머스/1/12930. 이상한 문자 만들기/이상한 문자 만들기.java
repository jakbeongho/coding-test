class Solution {
    public String solution(String s) {
        
        s = s.toLowerCase();
        
        char[] tmp = s.toCharArray();
            
        int reset = 0;
           
        for(int i=0;i<tmp.length;i++){
            if(tmp[i]==' '){
                reset = 0;
                continue;
            }
            
            if(reset%2==0){
                tmp[i] = (char)(tmp[i] - 32);
            }
            
            reset++;
        }
        
        String answer = new String(tmp);
        
        return answer;
    }
}