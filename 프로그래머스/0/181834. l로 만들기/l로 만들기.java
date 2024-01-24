class Solution {
    public String solution(String myString) {
        
        char[] tmp = myString.toCharArray();
        
        for(int i=0;i<tmp.length;i++){
            if(tmp[i]<'l'){
                tmp[i] = 'l';
            }
        }
        
        String answer = new String(tmp);
        
        return answer;
    }
}