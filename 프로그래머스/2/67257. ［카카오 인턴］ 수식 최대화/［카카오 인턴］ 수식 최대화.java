import java.util.*;

class Solution {
    
    boolean visited[];
    long answer = 0;
    List<Long> numList = new ArrayList<>();
    List<String> opList = new ArrayList<>();
    List<String> operators = new ArrayList<>();
    
    
    public long solution(String expression) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<expression.length();i++){
        
            char c = expression.charAt(i);
            
            if(c=='+'|| c=='-' || c=='*'){
                opList.add(String.valueOf(c));
                numList.add(Long.parseLong(sb.toString()));
                sb.setLength(0);
                continue;
            }
            
            sb.append(String.valueOf(c));
            
            if(i==expression.length()-1){
                numList.add(Long.parseLong(sb.toString()));
            }
        }
        
        
        if(expression.contains("+")){
            operators.add("+");
        }
        if(expression.contains("-")){
            operators.add("-");
        }
        if(expression.contains("*")){
            operators.add("*");
        }
        
        visited = new boolean[operators.size()];
        dfs(new String[operators.size()], 0);
       
        return answer;
    }
           
    public void dfs(String[] priority, int n){
        if(n==operators.size()){
            answer = Math.max(Math.abs(calcurate(priority)), answer);
            return;
        }
        
        for(int i=0; i<operators.size();i++){
            if(!visited[i]){
                visited[i] = true;
                priority[n] = operators.get(i);
                dfs(priority, n+1);
                visited[i] = false;
                priority[n] = null;
            }
        }
    }
    
    public long calcurate(String[] priority){
        List<Long> tmpNumList = new ArrayList<>(numList);
        List<String> tmpOpList = new ArrayList<>(opList);
        
        long result = 0;
        
        int index = 0;
        while(!tmpOpList.isEmpty()){
            if(tmpOpList.contains(priority[index])){
                for(int i=0; i<tmpOpList.size();i++){
                    if(tmpOpList.get(i).equals(priority[index])){
                        tmpNumList.add(i,
                            calc(tmpNumList.remove(i), tmpNumList.remove(i), tmpOpList.remove(i)));
                        break;
                    }
                }
            }
            else{
                index++;
            }
        }
        
        result = tmpNumList.get(0);
        
        return result;
        
    }
    
    public long calc(long num1, long num2, String op){
        long result = 0;
        if(op.equals("+")){
            result = num1 + num2;
        }
        else if(op.equals("-")){
            result = num1 - num2;
        }
        else if(op.equals("*")){
            result = num1 * num2;
        }
        return result;
    }
    
}