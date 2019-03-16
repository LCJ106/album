import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int length=input.length;
        ArrayList<Integer> list=new ArrayList<>();
        if(k>length){
            return list;
        }
        for(int i=0;i<k;i++){
            for(int j=i+1;j<length;j++){
                if(input[j]<input[i]){
                    int temp=input[i];
                    input[i]=input[j];
                    input[j]=temp;
                }
            }
            Integer a=input[i];
            list.add(a);                    
        }
        return list;
    }
}
