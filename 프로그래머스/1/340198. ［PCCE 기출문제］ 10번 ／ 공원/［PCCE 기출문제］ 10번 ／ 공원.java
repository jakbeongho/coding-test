class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int max = 0;
        boolean b = false;
        int extent = Math.min(park.length,park[0].length);
        System.out.println(extent);
        while(!b){
            for(int i=0;i<=park.length-extent;i++){
                for(int j=0;j<=park[0].length-extent;j++){
                    if(check(extent,park,i,j)){
                        b = true;
                        max = extent;
                        System.out.println("X");
                        break;
                    }
                }
                if(b){
                    System.out.println(extent);
                    break;
                }
            }
            extent--;
        }
        
        System.out.println(extent);
        
        for(int i=0;i<mats.length;i++){
            if(max>=mats[i]){
                answer = Math.max(answer,mats[i]);
            }
        }
        
        return answer;
    }
    
    public boolean check(int extent, String[][] park, int x, int y){
        for(int i=0;i<extent;i++){
            for(int j=0;j<extent;j++){
                if(!park[x+i][y+j].equals("-1")){
                    return false;
                }
            }
        }
        return true;
    }
}