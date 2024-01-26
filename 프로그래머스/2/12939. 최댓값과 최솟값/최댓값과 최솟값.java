import java.util.Arrays;

class Solution {
    public String solution(String str) {
         String[] array = str.split(" ");
        int[] arrayInt = new int[array.length];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(arrayInt);
        String result = arrayInt[0] + " " + arrayInt[arrayInt.length - 1];

        return result;

    
    }
}