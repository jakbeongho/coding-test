class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        
        int min = 0;
    
        for(int i=0;i<musicinfos.length;i++){
            String[] info = musicinfos[i].split(",");
            
            int playTime = convertTime(info[0],info[1]);
            
            String musicScore = convertScore(info[3]);
            String mScore = convertScore(m);
            
            if(checkMusic(mScore,musicScore,playTime) && playTime>min){
                answer = info[2];
                min = playTime;
            }
        
        }
        
        return answer;
    }
    
    public int convertTime(String start,String end){
            
        int startTime = Integer.parseInt(start.substring(0,2))*60+Integer.parseInt(start.substring(3)); 
        int endTime = Integer.parseInt(end.substring(0,2))*60+Integer.parseInt(end.substring(3));
        
        return endTime-startTime;

    }
    
    public String convertScore(String score){
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<score.length();i++){
            
            if(i==score.length()-1){
                sb.append(score.charAt(i));
                break;
            }
            
            if(score.charAt(i+1)=='#'){
                sb.append(Character.toLowerCase(score.charAt(i)));
                i++;
                continue;
            }
            sb.append(score.charAt(i));
        }
        
        return sb.toString();
    }
    
    
    public boolean checkMusic(String m,String score,int playTime){
        
        StringBuilder sb = new StringBuilder();
        
        int repeat = playTime/score.length();
        int cut = playTime%score.length();
        
        for(int i=0;i<repeat;i++){
            sb.append(score);
        }
        
        sb.append(score.substring(0,cut));
        
        return sb.toString().contains(m);
        
    }
}