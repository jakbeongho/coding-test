class Solution {
    public String solution(String s) {
       
        
        String tmp =s.toLowerCase();       
        
        char[] charArray = tmp.toCharArray();
        
        boolean uppercase=true;
        
        for(int i=0;i<tmp.length();i++){
          
            if(uppercase){
                charArray[i] = Character.toUpperCase(charArray[i]);
                uppercase=false;
            }
            
            if(charArray[i]==' '){
                uppercase= true;
            }
            else{
                uppercase= false;
            }
            
            
            
        }
        
        String answer = new String(charArray);
        
        return answer;
    }
}