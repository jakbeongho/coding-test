import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        Map<Integer, Integer> tmpMap = new HashMap<>();
        
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                tmpMap.put(rank[i],i);
            }
        }
        
        List<Integer> tmpList = new ArrayList<>(tmpMap.keySet());
        
        Collections.sort(tmpList);
        
        int a;
        int b;
        int c;
        
        a = tmpMap.get(tmpList.get(0));
        b = tmpMap.get(tmpList.get(1));
        c = tmpMap.get(tmpList.get(2));
    
        return a*10000 + b*100 + c;
    }
}