class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] tmp = s.split(" ");
        
        int max=Integer.parseInt(tmp[0]);
        int min=Integer.parseInt(tmp[0]);
        
        for(int i=0;i<tmp.length;i++){
            if(max< Integer.parseInt(tmp[i])){
                max = Integer.parseInt(tmp[i]);
            }
            
            if(min>Integer.parseInt(tmp[i])){
                min = Integer.parseInt(tmp[i]);
            }
            
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}