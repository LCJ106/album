public class Solution {
    public int RectCover(int target) {
        if(target<=0)
            return 0;
        if(target==1|target==2)
            return target;
        int result=0,m=1,n=2;
        for(int i=0;i<target-2;i++){
            result=m+n;
            m=n;
            n=result;
        }
        return result;

    }
}
