public class Solution {
    public int LastRemaining_Solution(int n, int m) { //步长m,总人数n,得到最后一个出队的初始下标
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
