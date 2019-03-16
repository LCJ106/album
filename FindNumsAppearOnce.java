//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.*;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int length=array.length;
        LinkedList<Integer> list=new LinkedList<Integer>();
        for(int i=0;i<length;i++){
            int count=0;
            for(int j=0;j<length;j++){
                if(array[i]==array[j])
                    count++;
            }
            if(count==1)
                list.add(array[i]);
        }
        num1[0]=list.remove(0);
        num2[0]=list.remove(0);
    }
}
