import java.util.*;
 
class Solution {
  public long solution(long n) {
        long answer = 0;
      
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);
 
        StringBuilder tmp = new StringBuilder();
        for(int i=0;i<list.length;i++){
            tmp.append(list[i]);
        }
 
        answer =Long.parseLong(tmp.reverse().toString());
      
        return answer;
  }
}
