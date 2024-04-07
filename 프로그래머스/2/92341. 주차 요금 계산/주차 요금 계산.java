import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        Map<Integer,Integer> use = new HashMap<>();
        Map<Integer,Integer> totalTime = new HashMap<>();
        
        int basicTime = fees[0];
        int basicPrice = fees[1];
        int unitTime = fees[2];
        int unitPrice = fees[3];
        
        for(int i=0;i<records.length;i++){
            
            String[] car = records[i].split(" ");
            int useTime = 0;
            int carNumber = Integer.parseInt(car[1]);
            
            if(car[2].equals("IN")){
                use.put(carNumber,convertMinute(car[0]));
            }
            else if(car[2].equals("OUT")){
                useTime = convertMinute(car[0]) - use.get(carNumber);
                use.remove(carNumber);
                totalTime.put(carNumber,totalTime.getOrDefault(carNumber,0)+useTime);
            }
        }
        
        Set<Integer> noExit = new HashSet<>(use.keySet());
        
        for(int carNumber : noExit) {
            int useTime = convertMinute("23:59") - use.get(carNumber);
            use.remove(carNumber);
            totalTime.put(carNumber,totalTime.getOrDefault(carNumber,0)+useTime);
        }
        
        int[] answer = new int[totalTime.size()];
        
        TreeSet<Integer> sortCarNumber = new TreeSet<>(totalTime.keySet());
        
        int index = 0;
        for(Integer carNumber : sortCarNumber){
            answer[index] = convertMoney(totalTime.get(carNumber),basicTime,basicPrice,unitTime,unitPrice);
            index++;
        }
        
        return answer;
    }
    
    public int convertMinute(String time){
        
        int result = 0;
        
        String[] timeArray = time.split(":");
        
        result = Integer.parseInt(timeArray[0])*60 + Integer.parseInt(timeArray[1]);
        
        return result;
    }
    
    public int convertMoney(int time,int basicTime, int basicPrice, int unitTime, int unitPrice){
        
        int result = 0;
        
        if(time<=basicTime){
            return basicPrice;
        }
        else{
            time -= basicTime;
            result += basicPrice;
            int count = (int) Math.ceil(((double)time/unitTime));
            result += count*unitPrice;
        }
        
        return result;
    }
    
}