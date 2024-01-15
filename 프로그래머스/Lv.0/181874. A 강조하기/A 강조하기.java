class Solution {
    public String solution(String myString) {
      
        
        char[] charArray = myString.toCharArray();
        
        for(int i=0; i<charArray.length;i++){
            if(charArray[i] =='a'){
                charArray[i] ='A';
            }
            else if('B'<=charArray[i] && charArray[i]<='Z'){
                charArray[i] = (char) ((int)charArray[i] + 32);
            }
        }
        
        
          String answer = new String(charArray);
        
        return answer;
    }
}