import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Queue<String> queue = new LinkedList<>();
        
        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i,i+1);
            queue.add(str);
        }
        
        
        for(int i = 0; i < s.length(); i++){
            String first = queue.poll();
            queue.add(first);
            
            Stack<String> stack = new Stack<>();
            
            for(int j = 0; j < s.length(); j++){
                String tmp = queue.poll();
                queue.add(tmp);
                
                if(stack.isEmpty()){
                    stack.push(tmp);
                } 
                else if(tmp.equals(")") && stack.peek().equals("(")){
                    stack.pop();
                }
                else if(tmp.equals("]") && stack.peek().equals("[")){
                    stack.pop();
                }
                else if(tmp.equals("}") && stack.peek().equals("{")){
                    stack.pop();
                }
                else{
                    stack.push(tmp);
                }
                
            }
            if(stack.isEmpty()){
                answer++;
            }
        }
        
        return answer;
    }
}
        