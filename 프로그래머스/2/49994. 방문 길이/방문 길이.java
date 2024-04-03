import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;

        int[] location = {0, 0, 0, 0};
        int[] reverse = {0, 0, 0, 0};
        Set<String> visited = new HashSet<>();
        int count = 0;
        
        for(int i = 0; i < dirs.length(); i++) {
            
            char tmp = dirs.charAt(i);
            boolean over = false;
                        
            switch(tmp) {
                case 'L': 
                    if(location[2] - 1 < -5) {
                        over = true;
                        break;
                    }
                    location[2] = location[2] - 1;
                    break;
                case 'R': 
                    if(location[2] + 1 > 5) {
                        over = true;
                        break;
                    }
                    location[2] = location[2] + 1;
                    break;
                case 'U': 
                    if(location[3] + 1 > 5) {
                        over = true;
                        break;
                    }
                    location[3] = location[3] + 1;
                    break;
                case 'D': 
                    if(location[3] - 1 < -5) {
                        over = true;
                        break;
                    }
                    location[3] = location[3] - 1;
                    break;
                default: 
                    break;
            }
            
            if(over) {
                continue;
            }
            
            String current = Arrays.toString(location);
            
            reverse[0] = location[2];
            reverse[1] = location[3];
            reverse[2] = location[0];
            reverse[3] = location[1];
            
            String reverseCurrent = Arrays.toString(reverse);
             System.out.println(i+"/"+current+"/"+tmp);

            location[0] = location[2];
            location[1] = location[3];
            
            if(visited.contains(current)) {
                continue;
            }
            
            visited.add(current);
            visited.add(reverseCurrent);
            
            
            System.out.println(i+"/"+current);
            
            count += 1;
        }
        
        answer = count;
        
        return answer;
    }
}