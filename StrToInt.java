//看回答应该是+123返回123，-123返回-123，其他符号不行，123+123这样估计返回0
public class Solution {
    public int StrToInt(String str) {
        char a='0';
        char b='9';
        int c=0;
        if(str.length()==0)
            return 0;
        if (str.charAt(0)=='+'){
            if(str.length()==1)
                return 0;
            for(int i=1;i<str.length();i++){
                  if(a<=str.charAt(i)&str.charAt(i)<=b){
                       c=c*10+str.charAt(i)-48;                 
                   }                             
                  else
                    return 0;            
            }
            return c;
        }
        else if(str.charAt(0)=='-'){
            if(str.length()==1)
                return 0;
             for(int i=1;i<str.length();i++){
                  if(a<=str.charAt(i)&str.charAt(i)<=b){
                       c=c*10+str.charAt(i)-48;                 
                   }                             
                  else
                    return 0;            
            }
            return -c;
        }
        else{
            for(int i=0;i<str.length();i++){
                  if(a<=str.charAt(i)&str.charAt(i)<=b){
                       c=c*10+str.charAt(i)-48;                 
                   }                             
                  else
                    return 0;            
            }
            return c;
        }
    }
}
