import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> burgerStack = new Stack<>();

        int[] recipe = {1, 2, 3, 1};
        
        for (int i = 0; i < ingredient.length; i++) {
            burgerStack.push(ingredient[i]); 
            
            if (burgerStack.size() >= recipe.length) {
                
                boolean make = true;

                for (int j = 0; j < recipe.length; j++) {
                    if (burgerStack.get(burgerStack.size() - recipe.length + j) != recipe[j]) {
                        make = false;
                        break;
                    }
                }

                if (make) {
                    for (int j = 0; j < recipe.length; j++) {
                       burgerStack.pop();
                    }
                    answer++;
                }
            }
        }

        return answer;
    }
}