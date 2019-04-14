//用split()语句做的，评论区有其他方法，算法思想唉
public class Solution {
    public String ReverseSentence(String str) {
        int length=str.length(),count=0;
        String string="";
        boolean flag=false;
        if(length==0)
            return string;
        for(int i=length-1;i>=0;i--){
            if(str.charAt(i)==' ')
                count++;
            else
                flag=true;
        }
        if(!flag)
            return str;
        String[] array=str.split(" ");
        for(int i=count;i>=0;i--){
            if(i!=0)
               string=string+array[i]+" ";
            else
                string=string+array[i];
        }
        return string;
    }
}
