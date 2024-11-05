import java.util.*;

class Solution {
    
    int[] start = new int[3];
    int[] lever = new int[3];
    int[] exit = new int[3];
    int[] dx = new int[] {1, 0, -1, 0};
    int[] dy = new int[] {0, 1, 0, -1};
    boolean visited[][];
    
    public int solution(String[] maps) {
        int answer = 0;
        
        findPoint(maps);
        
        int leverCount = bfs(start,lever,maps);
        int exitCount = bfs(lever,exit,maps);
        
        if(leverCount==-1 || exitCount==-1){
            return -1;
        }
        answer = leverCount + exitCount;
        return answer;
    }
    
    public void findPoint(String[] maps){
        for(int i=0;i<maps.length;i++){
            for(int j=0;j<maps[0].length();j++){
                char c = maps[i].charAt(j);
                if(c=='S'){
                    start[0] = i;
                    start[1] = j;
                }
                else if(c=='L'){
                    lever[0] = i;
                    lever[1] = j;
                }
                else if(c=='E'){
                    exit[0] = i;
                    exit[1] = j;
                }
            }
        }
    }
    
    public int bfs(int[] startPoint , int[] endPoint , String maps[]){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(startPoint);
        visited = new boolean[maps.length][maps[0].length()];
        visited[startPoint[0]][startPoint[1]] = true;
        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            if(tmp[0] == endPoint[0] && tmp[1] == endPoint[1]){
                return tmp[2];
            }
            for(int i=0;i<4;i++){
                int x = tmp[0] + dx[i];
                int y = tmp[1] + dy[i];
                if(x<0 || x>=maps.length || y<0 || y>=maps[0].length()){
                    continue;
                }
                if(!visited[x][y] && maps[x].charAt(y) != 'X'){
                    queue.add(new int[] {x, y, tmp[2] + 1});
                    visited[x][y] = true;
                }
                
            }
        }
        return -1;
    }
}