class Solution {
    public String solution(String s, int n) {
        
        
        char[] tmp = s.toCharArray();
        
        for(int i=0;i<tmp.length;i++){
            if(65<=tmp[i] && tmp[i]<=90){
                if(tmp[i]+n>90){
                    tmp[i] =(char)(tmp[i] + n -26);    
                }
                else{
                    tmp[i] =(char)(tmp[i] + n);
                }
            }
            else if(97<=tmp[i] && tmp[i]<=122){
                if(tmp[i]+n>122){
                   tmp[i] =(char)(tmp[i] + n -26);     
                }
                else{
                    tmp[i] =(char)(tmp[i] + n);
                }
            }
        }
        String answer = new String(tmp);
        
        return answer;
    }
}