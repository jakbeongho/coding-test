class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] array = my_string.split(" ");
        
        boolean plus = true;
        
        for(int i=0;i<array.length;i++){
            
            if(array[i].equals("+")){
                plus = true;
                continue;
            }
            else if(array[i].equals("-")){
                plus = false;
                continue;
            }
            
            if(plus){
                answer += Integer.parseInt(array[i]);
            }
            else{
                answer -= Integer.parseInt(array[i]);
            }
        
        }
        
        return answer;
    }
}