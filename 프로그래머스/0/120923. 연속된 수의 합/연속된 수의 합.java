class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int avg = total/num;
        int first = avg-(num-1)/2;
        
        for(int i=0;i<num;i++){
                answer[i] = first;
                first++;
        }
        
        return answer;
    }
}