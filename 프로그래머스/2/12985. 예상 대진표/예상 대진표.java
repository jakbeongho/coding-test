class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        int tmp = a;
        a = Math.min(a,b);
        b = Math.max(tmp,b);

        while(true){
            
            if(b-a==1 && a%2==1){
                break;
            }
            
            a = nextNumber(a);
            b = nextNumber(b);
            
            answer++;
        }
        
        return answer;
    }
    
    public int nextNumber(int x){
        
        if(x%2==1){
            x = (x+1)/2;
        }
        else{
            x = x/2;
        }
        
        return x;
    }
}