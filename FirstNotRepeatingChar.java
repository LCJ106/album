public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int length=str.length();
        boolean flag=false;
        int result=0;
        for(int i=0;i<length;i++){
            flag=true;
            for(int j=0;j<length;j++){
                if((str.charAt(i)==str.charAt(j))&&(i!=j)){
                    flag=false;
                    break;
                }
                    
            }
            if(flag){
                result=i;
                break;
            }
        }
        if(!flag)
            return -1;
        else
            return result;
    }
}
