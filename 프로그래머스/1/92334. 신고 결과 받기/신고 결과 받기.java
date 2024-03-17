import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] answer = new int[id_list.length];
    
        Set<String> reportSet = new HashSet<>();
        
        Map<String,Integer> reportCount = new HashMap<>();
        
        Map<String,String> reportMap = new HashMap<>();
        
        for(int i=0;i<report.length;i++){
            
            if(reportSet.add(report[i])){
                String[] user = report[i].split(" ");
                
                reportCount.put(user[1],reportCount.getOrDefault(user[1],0)+1);
                
                reportMap.put(user[0],reportMap.getOrDefault(user[0],"")+user[1]+"/");
            }
            else{
                continue;
            }
            
        }
        
        for(int i=0;i<id_list.length;i++){
            
            int temp = 0;
            
            if(reportMap.containsKey(id_list[i])){
                 
                String[] My_report = reportMap.get(id_list[i]).split("/");
                  
                for(int j=0;j<My_report.length;j++){
                    if(reportCount.get(My_report[j])>=k){
                        temp++;
                    }
                }
            }
            else{
                continue;
            }
            
            answer[i]= temp;
            
        }
        
        return answer;
        
    }
}