class Solution {
    public int[] solution(String myString) {
       
        
        String[] Xcut = myString.split("x", -1);
        
        int[] answer = new int[Xcut.length];
        
        for(int i=0;i<Xcut.length;i++){
            answer[i] = Xcut[i].length();
            System.out.println(Xcut[i]);
        }
        
        
        return answer;
    }
}