class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int opS = convertTime(op_start);
        int opE = convertTime(op_end);
        int play = convertTime(pos);
        int length = convertTime(video_len);
        
        for(int i=0;i<commands.length;i++){
            
            if(play>=opS && play<=opE){
                play = opE;
            }
            
            if(play>length){
                play = length;
            }
            
            if(commands[i].equals("prev")){
                play = play - 10;
            }
            else if(commands[i].equals("next")){
                play = play + 10;
            }
            
            if(play>=opS && play<=opE){
                play = opE;
            }
            
            if(play<0){
                play = 0;
            }
        }
        
        if(play>length){
            return video_len;
        }
 
        answer = convertString(play);
        
        return answer;
    }
    
    public int convertTime(String time){
        int result = 0;
        String[] tmp = time.split(":");
        result = Integer.parseInt(tmp[0])*60 + Integer.parseInt(tmp[1]);
        return result;
    }
    public String convertString(int time){    
        String hour = ""+time/60;
        if(time/60<10){
            hour = "0"+hour;
        }
        String minute = ""+time%60;
        if(time%60<10){
            minute = "0"+minute;
        }
        String result = hour + ":" + minute;
        return result;
    }
}