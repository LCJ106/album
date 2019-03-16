public class Solution {
    public String replaceSpace(StringBuffer str) {
    	String str1=" ";
        int i;
        while(true){
            i=str.indexOf(str1);
            if(i==-1)
                break;
            str.replace(i,i+1,"%20");
        }
        return str.toString();
    }
}
