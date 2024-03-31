import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int s : scoville) {
            queue.add(s);
        }

        while(queue.peek()<K){

            int first = queue.poll();

            if(queue.peek()==null){
                return -1;
            }

            int second = queue.poll();

            queue.add(first+second*2);
            answer+=1;

        }

        return answer;
    }
}