import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String,Integer> wantList = new HashMap<>();
        Map<String,Integer> discountList = new HashMap<>();

        for(int i=0;i<want.length;i++){
            wantList.put(want[i], number[i]);
        }

        for(int i=0;i<=discount.length-10;i++){
            discountList.clear();

            for(int j=i;j<i+10;j++){
                 discountList.put(discount[j],discountList.getOrDefault(discount[j],0)+1);
            }

            if(wantList.equals(discountList)){
                answer += 1;
            }
        }

        return answer;
    }
}