class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        s = s.toLowerCase();

        int pCount = 0;
        int yCount = 0;
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='p'){
                pCount +=1;
            }
            
            if(s.charAt(i)=='y'){
                yCount += 1;
            }
            
        }

        if(pCount==yCount){
            answer = true;
        }
        
        return answer;
    }
}