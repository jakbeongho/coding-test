class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder halfAnswer = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                halfAnswer.append(i);
            }
        }

        answer.append(halfAnswer).append("0").append(halfAnswer.reverse());

        return answer.toString();
    }
}