public class Solution {
    public int Fibonacci(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int i=0,j=1,result=0;
        for(int m=1;m<n;m++){
            result=i+j;
            i=j;
            j=result;           
        }
        return result;
        
    }
}
