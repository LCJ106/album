public class Solution {
    public int NumberOf1(int n) {
        int count=0;
        while(n>0){
             if((n&1)!=0){
                count++;
                }
            n=n>>1;
        }
        if(n<0){
            n=-n;
            n=~n+1;
            for(int i=0;i<32;i++){
             if((n&1)!=0){
                count++;
                }
             n=n>>>1;
            }
            
        }
        return count;
    }
}
