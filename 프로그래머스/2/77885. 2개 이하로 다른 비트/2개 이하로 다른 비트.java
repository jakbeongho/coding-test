class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0;i<numbers.length;i++){
            
            String BinaryNumber= bitConvert(Long.toBinaryString(numbers[i]));
            
            answer[i] = Long.parseLong(BinaryNumber,2);
            
        }
        
        return answer;
    }
    
    public String bitConvert(String Binary){
        
        String result = "";
        
        int lastZeroIndex = Binary.lastIndexOf('0');
        int lastOneIndex = Binary.lastIndexOf('1');
        
        if(lastZeroIndex==-1){
            return "10"+ Binary.substring(1);
        }
        
        if(lastOneIndex<lastZeroIndex){
            return Binary.substring(0,lastZeroIndex)+"1";
        }
        
        if(lastOneIndex>lastZeroIndex){
            return Binary.substring(0,lastZeroIndex)+"10"+Binary.substring(lastZeroIndex+2);
        }
        
        return result;
        
    }
    
}