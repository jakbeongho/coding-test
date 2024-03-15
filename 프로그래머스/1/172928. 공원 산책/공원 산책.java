class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int x = 0;
        int y = 0;
        
        for(int i=0;i<park.length;i++){
            
            for(int j=0;j<park[i].length();j++){

               if(park[i].charAt(j)=='S'){
                   x=j;
                   y=i;
               }
            } 
        }
        
        for(int i=0;i<routes.length;i++){
            
            char op = routes[i].charAt(0);
            int n = Integer.parseInt(routes[i].substring(2)); 
            boolean check = true;
            
            switch(op){
                case 'E':
                    if(x+n>=park[y].length()){
                        check = false;
                    }
                    else{
                        for(int j=1;j<=n;j++){
                            if(park[y].charAt(x+j)=='X'){
                                check = false;
                                break;
                            }
                        }
                    }
                   
                    if(check){
                        x = x+n;
                    }
                    
                    break;
                    
                case 'W':
                    if(x-n<0){
                        check = false;
                    }
                    else{
                        for(int j=1;j<=n;j++){
                            if(park[y].charAt(x-j)=='X'){
                                check = false;
                                break;
                            }
                        }
                    }
                   
                    if(check){
                        x = x-n;
                    }
                    
                    break;
                case 'N':
                    if(y-n<0){
                        check = false;
                    }
                    else{
                        for(int j=1;j<=n;j++){
                            if(park[y-j].charAt(x)=='X'){
                                check = false;
                                break;
                            }
                        }
                    }
                    if(check){
                        y = y-n;
                    }
                    
                    break;
                case 'S':
                    if(y+n>=park.length){
                        check = false;
                    }
                    else{
                        for(int j=1;j<=n;j++){
                            if(park[y+j].charAt(x)=='X'){
                                check = false;
                                break;
                            }
                        }
                    }
                    if(check){
                        y = y+n;
                    }
                    break; 
                    
            }
            
        }
        
        answer[0] = y;
        answer[1] = x;
        
        return answer;
        
    }
}