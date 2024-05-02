class Solution {
    public String solution(String number, int k) {
        String answer = "";
        String Original = number;
        
        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        int numberLength = number.length();
        int index = 0;
        
        while(k>0){
            int tmp = deleteNumber(number, k);
            k = k-tmp;
            sb.append(number.charAt(tmp));
            number = number.substring(tmp+1);
            if(tmp == 0){
                count+=1;
            }
            if(count>=numberLength){
                return Original.substring(0,numberLength-k);
            }
        }
        
        sb.append(number);
        
        answer = sb.toString();
    
        return answer;
    }
    
    public int deleteNumber(String number,int k){
        
        int index = 0;
        
        for(int i=9;i>=0;i--){
            
            char c = (char) (48+i);
                
            index = number.indexOf(c);
            
            if(index==-1){
                continue;
            }
            
            if(index<=k){
                break;
            } 
        }
        
        return index;
    }
}