public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        int x=0;
        if(n==0)
            return -1;

        else{

            for(int i=2;i<=n;i++){
                x=(x+m)%i;


            }
            return x;}
    }
}
