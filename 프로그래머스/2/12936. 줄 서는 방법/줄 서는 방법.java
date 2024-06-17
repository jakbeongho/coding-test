import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        
        List<Integer> people = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            people.add(i);
        }
        
        int index = 0;
        
        for(int i=n-1;i>=2;i--){
            
            long unit = factorial(i);
            int tmp = (int)(k/unit);
            
            k = k%unit;
            if(k==0){
                answer[index] = people.get(tmp-1);
                people.remove(tmp-1);
                index++;
                break;
            }
            
            answer[index] = people.get(tmp);
            people.remove(tmp);
            index++;
            
        }
        
        if(k==0){
            for(int j=people.size();j>=1;j--){
                    answer[index] = people.get(j-1);
                    people.remove(j-1);
                    index++;
            }
        }
        else{
            answer[index] = people.get(0);
            people.remove(0);
            index++;
            answer[index] = people.get(0);
        }
        
        return answer;
    }
    
    public long factorial(int n){
        long result = 1;
        
        for(int i=1;i<=n;i++){
            result *=i;
        }
        
        return result;
    }
}