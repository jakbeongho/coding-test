import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder tmp = new StringBuilder();
        
        for(int i=0;i<a;i++){
            tmp.append("*");
        }
        
        for(int i=0;i<b;i++){
            System.out.println(tmp.toString());
        }              
                       
 
    }
}