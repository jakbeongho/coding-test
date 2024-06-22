class Solution {
    public String solution(String p) {
        String answer = "";
        
        String[] first = cutUV(p);
        
        answer = process(first[0],first[1]);
        
        return answer;
    }
    
    public static String[] cutUV(String p){
        
        String[] result = new String[2];
        
        result[0] = "";
        result[1] = "";
        
        int balance = 0;
        
        for(int i=0;i<p.length();i++){
            char tmp = p.charAt(i);
            if(tmp=='('){
                balance +=1;
            }
            else if(tmp==')'){
                balance -=1;
            }
            
            if(balance==0){
                result[0] = p.substring(0,i+1);
                result[1] = p.substring(i+1);
                break;
            }
        }
        
        return result;
    }
    
    public static boolean check(String u){
        
        int balance = 0;
        
        for(int i=0;i<u.length();i++){
            char tmp = u.charAt(i);
            
            if(tmp=='('){
                balance +=1;
            }
            else if(tmp==')'){
                balance -=1;
            }
            
            if(balance<=-1){
                return false;
            }
        }
        
        return true;
    }
    
    public static String process(String u, String v){
        
        String result = "";
        String[] cut = cutUV(v);

        if(check(u)){
   
        	if(v.equals("")){
            	return u;
            }
        	
        	System.out.println("check true");
            result = u + process(cut[0],cut[1]);
        }
        else{
        	System.out.println("check false");
            result = "(";
            result += process(cut[0],cut[1]);
            result += ")";
            result += reverse(u);
        }
        
        return result;
    }
    
    public static String reverse(String u){
        String result = "";
        for(int i=1;i<u.length()-1;i++){
            char tmp = u.charAt(i);
            if(tmp=='('){
                result +=")";
            }
            else if(tmp==')'){
                result +="(";
            }
        }
        
        return result;
    }
}