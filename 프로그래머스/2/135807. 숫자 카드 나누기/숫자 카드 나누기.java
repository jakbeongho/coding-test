import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        List<Integer> divisorsA = getDivisors(arrayA[0]);
        List<Integer> divisorsB = getDivisors(arrayB[0]);

        int aGcd = getArrayGcd(divisorsA, arrayA);
        int bGcd = getArrayGcd(divisorsB, arrayB);
        
        aGcd = noDivisor(aGcd,arrayB);
        bGcd = noDivisor(bGcd,arrayA);
        
        answer = Math.max(aGcd,bGcd);

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
        
        Collections.sort(divisors, Collections.reverseOrder());
        
        return divisors;

    }

    public int getArrayGcd(List<Integer> divisors, int[] array){

        int result = 0;

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
                result = divisor;
                break;
            }

        }
        return result;
    }

    public int noDivisor(int Gcd, int[] array){

        int result = Gcd;
        boolean check = true;

        for(int i=0;i<array.length;i++){
            if(array[i]%Gcd==0){
                result = 1;
                break;
            }
        }

        return result;
    } 

}