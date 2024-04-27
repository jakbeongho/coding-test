import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        Comparator<String> comparator = new Comparator<String>(){
            
            public int compare(String a, String b){
                String ab = a + b;
                String ba = b + a;
                
                return ba.compareTo(ab);
            }
            
        };
        
        String[] strNums = new String[numbers.length];
        
        for(int i=0; i< numbers.length;i++){
            strNums[i]= String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNums, comparator);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<strNums.length;i++){
            sb.append(strNums[i]);
        }
        
        answer = sb.toString();
        
        if (sb.charAt(0)=='0') {
            return "0";
        }
        
        
        return answer;
    }
}