//可能这就是算法思想？temp为当前读取单词，遇到空格，加在结果res前，跳出循环，补上最后一个单词。16ms,9788k
public class Solution {
    public String ReverseSentence(String str) {
        int length=str.length();
        String temp="";
        String res="";
        for(int i=0;i<length;i++){
            if(str.charAt(i)==' ')
            {
                res=" "+temp+res;
                temp="";
            }
            else
                temp=temp+str.charAt(i);
        }
        res=temp+res;
        return res;
    }
}
