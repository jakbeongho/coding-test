import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        Queue<Character> skillStep = new LinkedList<>();
        
        for(int i=0;i<skill.length();i++){
            skillStep.add(skill.charAt(i));
        }
        
        for(int i=0;i<skill_trees.length;i++){
            if(checkSkill(skillStep, skill_trees[i])){
                answer+=1;
            }
        }
        
        return answer;
    }
    
    public boolean checkSkill(Queue<Character> skillStep, String skill_tree){
        
        boolean result = true;
        
        Queue<Character> queue = new LinkedList<>(skillStep);
        
        for(int i=0;i<skill_tree.length();i++){
            
            if(queue.contains(skill_tree.charAt(i))){ 
                if(queue.peek()==skill_tree.charAt(i)){
                    queue.poll();
                }
                else if(queue.peek()!=skill_tree.charAt(i)){
                    return false;
                }
            }
            
        }
        return result;
    }
    
}