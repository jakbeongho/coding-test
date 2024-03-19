import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
    
        String[] column = {"code","date","maximum","remain"};
        
        int ext_number= 0;
        int sort_by_number = 0;
        
        for(int i=0;i<column.length;i++){
            
            if(ext.equals(column[i])){
                ext_number = i;
            }
            
            if(sort_by.equals(column[i])){
                sort_by_number = i;
            }
            
        }
        
        Map<Integer,int[]> dataMap = new HashMap<>();
        List<Integer> dataMapKeySet = new ArrayList<>();
        
        for(int i=0;i<data.length;i++){
            
            if(data[i][ext_number]<val_ext){
                dataMap.put(data[i][sort_by_number],data[i]);
                dataMapKeySet.add(data[i][sort_by_number]);
            }
            
        }
        
        Collections.sort(dataMapKeySet);
        
        int[][] answer = new int[dataMap.size()][];
        
        for(int i=0;i<dataMap.size();i++){
            answer[i] = dataMap.get(dataMapKeySet.get(i)); 
        }
        
        return answer;
    }
}