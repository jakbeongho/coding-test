class Solution {
    public String solution(int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        int firstConvert = 1;
        int convert = 1;
        int length = 1;
        
        while(true){
            
            if(firstConvert>n){
                firstConvert -= convert;
                convert /= 3;
                length--;
                break;
            }
            
            convert *= 3;
            firstConvert += convert;
            length++;
        }
        
        int convertNum = n-firstConvert;
        String convertStr = Integer.toString(convertNum,3);
        
        for(int i=0;i<length-convertStr.length();i++){
            sb.append("0");
        }
       
        sb.append(convertStr);
        
        answer = country124(sb.toString());
        
        return answer;
        
    }
    
    public String country124(String str){
        
        String result = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char tmp = str.charAt(i);
            switch(tmp){
                case '0': sb.append("1");
                    break;
                case '1': sb.append("2");
                    break;
                case '2': sb.append("4");
            }
        }
        
        result = sb.toString();
        
        return result;
        
    }
}