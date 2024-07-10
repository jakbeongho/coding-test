class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        int Xnumber = 0;
        int number = 0;
        
        String[] array = polynomial.split("\\+");
        
        for(int i=0;i<array.length;i++){
            
            String tmp = array[i].replaceAll("\\s","");
            
            int x = tmp.indexOf("x");
            if(x!=-1){
                if(x==0){
                    Xnumber += 1;
                }else{
                    Xnumber += Integer.parseInt(tmp.substring(0,x));
                }
            }
            else{
                number += Integer.parseInt(tmp);
            }
        }
        
        if(Xnumber==0){
            answer += "";
        }
        else if(Xnumber==1){
            answer += "x";
        }
        else{
            answer += Xnumber+"x";
        }
        
        if(number!=0 && Xnumber!=0){
            answer += " + ";
        }
        
        if(number!=0){
            answer += ""+number;
        }
        
        return answer;
    }
}