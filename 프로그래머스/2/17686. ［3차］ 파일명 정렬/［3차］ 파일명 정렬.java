import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = {};
        Arrays.sort(files,fileName);
        answer = files;
        return answer;
    }
    
    Comparator<String> fileName = (o1, o2) -> {
        
        String head1 = o1.split("[0-9]")[0].toUpperCase();
        String head2 = o2.split("[0-9]")[0].toUpperCase();
        
        int result = head1.compareTo(head2);
        
        if(result==0){
            int number1 = getNumber(o1, head1);
            int number2 = getNumber(o2, head2);
        
            result = Integer.compare(number1, number2);
        }
        
        return result;
        
    };
    
    public int getNumber(String name, String head){
        
        StringBuilder sb = new StringBuilder();
        name = name.substring(head.length());
        for(int i=0;i<name.length();i++){
            
            char tmp = name.charAt(i);
            if(tmp >= '0' && tmp <= '9'){
                sb.append(tmp);
            }
            else{
                break;
            }
            
        }
        
        return Integer.parseInt(sb.toString());
        
    }
    
}