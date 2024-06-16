import java.util.*;

class Solution {
    
    public boolean[][] visit;
    public int food = 0;
    
    public int[] solution(String[] maps) {
        int[] answer;
        
        List<Integer> island = new ArrayList<>();
        
        visit = new boolean[maps.length][maps[0].length()];
        
        for(int i=0;i<maps.length;i++){
            for(int j=0;j<maps[0].length();j++){
                food = 0;
                findIsland(maps,i,j);
                if(food!=0){
                    island.add(food);
                }
            }
        }
        
        if(island.size()==0){
            return new int[]{-1};
        }
        
        answer = new int[island.size()];
        
        Collections.sort(island);
        
        for(int i=0;i<island.size();i++){
            answer[i] = island.get(i);
        }
        
        return answer;
    }
    
    public void findIsland(String[] maps, int x, int y){
        
        if(x<0 || x>=maps.length || y<0 || y>=maps[0].length()){
            return;
        }
        
        if(visit[x][y] || maps[x].charAt(y)=='X'){
            return;
        }
        else{
            food += Character.getNumericValue(maps[x].charAt(y));
            visit[x][y]=true;
        }
        
        findIsland(maps,x+1,y);
        findIsland(maps,x-1,y);
        findIsland(maps,x,y+1);
        findIsland(maps,x,y-1);
        
        return;
    }
}