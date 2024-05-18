import java.util.*;

class Solution {
    
    public Map<String,Integer> courseCount;
    public int max = 0;
    
    public String[] solution(String[] orders, int[] course) {
        
        List<String> answerList = new ArrayList<>();
        
        for(int c : course){
            courseCount = new HashMap<>();
            max = 0;
            
            for(String order: orders){
                char[] menu = order.toCharArray();
                Arrays.sort(menu);
                order = new String(menu);
                makeCourse(0,0,order,"",c);
            }
            
            for(String key : courseCount.keySet()){
                int value = courseCount.get(key);
                if(value > 1 && max == value){
                    answerList.add(key);
                }
            }
        }
        
        Collections.sort(answerList);
        String[] answer = answerList.toArray(new String[answerList.size()]);
        
        return answer;
    }
    
    public void makeCourse(int length, int index, String order,String cur, int end){
        if(length == end){
            courseCount.put(cur,courseCount.getOrDefault(cur,0)+1);
            max = Math.max(max,courseCount.get(cur));
        }
        
        for(int i = index; i < order.length(); i++){
            makeCourse(length+1,i+1,order,cur + order.charAt(i),end);
        }
    }
    
}