import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list=new ArrayList<>();
        int length=array.length;
        boolean flag=false;
        int a=-1,b=-1;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(array[i]+array[j]==sum){
                    a=array[i];
                    b=array[j];
                    flag=true;
                    break;
                }
            }
            if(flag)
                break;
        }
        if(!flag)
            return list;
        list.add(a);
        list.add(b);
        return list;
                    
    }
}
