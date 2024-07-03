class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        boolean contains = false;
        
        for(int i=0;i<dic.length;i++){
            if(dic[i].length()==spell.length){
                contains = true;
                for(int j=0;j<spell.length;j++){
                    if(dic[i].indexOf(spell[j])==-1){
                        contains = false;
                        break;
                    }
                }
            }
        }
        
        if(contains){
            answer= 1;
        }
        
        return answer;
    }
}