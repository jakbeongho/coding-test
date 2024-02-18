class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        
        for(int heigth=3;heigth<=Math.sqrt(area);heigth++){
            
            if(area%heigth==0){
                
                int width = area/heigth;
                
                if((width-2)*(heigth-2)==yellow){
                    answer[0] = width;
                    answer[1] = heigth;
                }
                
            }
            
        }
        
        return answer;
    }
}