import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
    
        List<Integer> divisorsA = getDivisors(arrayA[0]);
        List<Integer> divisorsB = getDivisors(arrayB[0]);
        
        List<Integer> divisorsArrayA = getArrayDivisors(divisorsA, arrayA);
        List<Integer> divisorsArrayB = getArrayDivisors(divisorsB, arrayB);
        
        int a = noDivisor(divisorsArrayA, arrayB);
        int b = noDivisor(divisorsArrayB, arrayA);
        
        answer = Math.max(a,b);
        
        if(answer==1){
            answer =0;
        }
        
        return answer;
    }
    
    public List<Integer> getDivisors(int a){
        
        List<Integer> divisors = new ArrayList<>();
        
        for(int i=1;i<=Math.sqrt(a);i++){
            if(a%i==0){
                divisors.add(i);
                divisors.add(a/i);
            }  
        }
        
        return divisors;
        
    }
    
    public List<Integer> getArrayDivisors(List<Integer> divisors, int[] array){
        
        List<Integer> ArrayDivisors = new ArrayList<>();
        
        boolean check = true;
        
        for(int i=0;i<divisors.size();i++){
            int divisor = divisors.get(i); 
            check = true;
            
            for(int j=0;j<array.length;j++){
                if(array[j]%divisor!=0){
                    check = false;
                    break;
                }
            }
            
            if(check){
                ArrayDivisors.add(divisor);
            }
            
        }
        
        Collections.sort(ArrayDivisors, Collections.reverseOrder());
        
        return ArrayDivisors;
        
    }
    
    public int noDivisor(List<Integer> divisors, int[] array){
        
        int result = 0;
        boolean check = true;
        
        for(int i=0;i<divisors.size();i++){
            int divisor = divisors.get(i); 

            check = true;
            
            for(int j=0;j<array.length;j++){
                if(array[j]%divisor==0){
                    check = false;
                    break;
                }
            }
            
            if(check){
                result = divisor;
                break;
            }
        }
        
        return result;
    } 
    
}