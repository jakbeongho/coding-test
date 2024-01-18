class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.replace("A","b");
        myString = myString.replace("B","a");
        
        myString = myString.toUpperCase();
        
        if(myString.contains(pat)){
            answer = 1;
        }
        
     
        return answer;
    }
}