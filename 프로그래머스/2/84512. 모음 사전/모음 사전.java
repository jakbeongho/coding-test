import java.util.ArrayList;
import java.util.List;
class Solution {
    public static String[] vowel = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();

        dfs(list,word, "", 0);
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    static void dfs(List<String> list,String word, String str, int depth) {
        list.add(str);
        
        if(depth == 5) {
            return;
        }
        
        for (int i = 0; i < vowel.length; i++) {
            dfs(list,word, str + vowel[i], depth + 1);
        }
    }
}