import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
  
        List<String> str1List = subset(str1);
        List<String> str2List = subset(str2);

        if(str1List.size()==0 && str2List.size()==0){
            return 65536;
        }
        
        int intersection = 0;
        
        for(int i=0;i<str1List.size();i++){
            
            if(str2List.contains(str1List.get(i))){
                intersection++;
                str2List.remove(str1List.get(i));
            }
        }
        
        int union = str1List.size() + str2List.size();
        
        double J = (double)intersection/union;
        
        answer = (int)(J*65536);
        
        return answer;
    }
    
    public List<String> subset(String a){
        
        List<String> set = new ArrayList<>();
        
        for(int i=0;i<a.length()-1;i++){
            
            boolean first = false;
            boolean second = false;
            
            if('a'<= a.charAt(i) && a.charAt(i) <= 'z' || 'A'<= a.charAt(i) && a.charAt(i) <= 'Z'){
                first = true;
            }
            
            if('a'<= a.charAt(i+1) && a.charAt(i+1) <= 'z' || 'A'<= a.charAt(i+1) && a.charAt(i+1) <= 'Z'){
                second = true;
            }
            
            if(first && second){
                if(i==a.length()-2){
                    set.add(a.substring(i).toUpperCase());
                    continue;
                }
                set.add(a.substring(i,i+2).toUpperCase());   
            }
            
        }
        return set;
    }
    
}