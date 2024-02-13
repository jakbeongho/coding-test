import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
   
        Arrays.sort(stages);
        
        Map<Integer,Double> tmp = new HashMap<>();
        
        int challenger = stages.length;
        int fail = 0;
        int stage = stages[0];
        
        for(int i=1;i<=N;i++){
            tmp.put(i,(double)0.0);
        }
        
        for(int i=0;i<stages.length;i++){
            
            if(stages[i]>stage){
                tmp.put(stage,(double)fail/challenger);
                System.out.println((double)fail/challenger);
                stage=stages[i];
                challenger -= fail;
                fail = 0;
            }
            fail++;  
        }
        
        if(stages[stages.length-1]==stage && stage <= N){
            tmp.put(stage,(double)fail/challenger);
        }
        
        List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(tmp.entrySet());
        Collections.sort(entryList, Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int[] answer = new int[entryList.size()];
        for (int i = 0; i < entryList.size(); i++) {
            answer[i] = entryList.get(i).getKey();
        }
        
        return answer;
    }
}