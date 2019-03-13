//思路插入排序
public class Solution {
    public void reOrderArray(int [] array) {
        int temp;
        for(int i=1;i<array.length;i++){
            for(int j=array.length-i-1;j<array.length-1;j++){
                if(array[j+1]%2==0)
                    break;
                if(array[j]%2==0&array[j+1]%2==1){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
                
            }
        }
    }
}
