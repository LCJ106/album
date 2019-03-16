public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int length=array.length,count=0;
        
        for(int i=0;i<length;i++){
            if(array[i]==k){
                count++;
            }
        }
        return count;
    }
}
