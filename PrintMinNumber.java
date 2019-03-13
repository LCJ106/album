//选择排序，字符串比较谁更适合在前
import java.util.ArrayList;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        int temp,j;
        String c="";
        for(int i=0;i<numbers.length-1;i++){
            
            for(j=i+1;j<numbers.length;j++){
                String a=""+numbers[j]+numbers[i];
                String b=""+numbers[i]+numbers[j];
                if(a.compareTo(b)<0){
                    temp=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=temp;
                }
            }
        }
        for(j=0;j<numbers.length;j++){
            c=c+numbers[j];
        }
        return c;
    }
}
