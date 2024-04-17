import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        List<String> answerList = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        for(int i = 0; i<record.length; i++){
            String[] strArr = record[i].split(" ");

            if(strArr[0].equals("Enter")){
                map.put(strArr[1],strArr[2]);
            }
            else if(strArr[0].equals("Change")){
                map.put(strArr[1],strArr[2]);
            }
        }

        for(int i =0; i<record.length; i++){
            String[] strArr = record[i].split(" ");

            if(strArr[0].equals("Enter")){
                answerList.add(map.get(strArr[1])+"님이 들어왔습니다.");
            }
            else if(strArr[0].equals("Leave")){
                answerList.add(map.get(strArr[1])+"님이 나갔습니다.");
            }
        }

        
        answer = answerList.stream().toArray(String[]::new);
        
        return answer;
    }
}