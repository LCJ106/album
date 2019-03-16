public class Solution {
    public int JumpFloor(int target) {
        if(target<=0)
               return 0;
        if(target==1|target==2)
            return target;
        int i=1,j=2,result=0;
        for(int m=0;m<target-2;m++){
            result=i+j;
            i=j;
            j=result;
        }
        return result;
        
    }
}
