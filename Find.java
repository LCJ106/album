public class Solution {
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(target==array[i][j])
                    return true;
            }
        }
        return false;
       
    }
    public static void main(String[] args){
        int array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int x=55;
        System.out.println(new Solution().Find(55,array));
    }
}
