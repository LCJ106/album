//求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
public class Solution {
    public int sun(int n){
        int m;
        if(n==0)
            return 0;
        m=n+sun(n-1);
        return m;
    }
    public int Sum_Solution(int n) {
       return  sun(n);
    }
