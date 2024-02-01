class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        int tmp =0;
        
        String stringX = Integer.toString(x);
        
        for(int i=0;i<stringX.length();i++){
            tmp += stringX.charAt(i) - '0';
        }
        
        if(x%tmp == 0){
            answer = true;
        }
        
        return answer;
    }
}