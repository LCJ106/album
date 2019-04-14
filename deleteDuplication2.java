//以为改一下会更简单点，唉，一样麻烦
import java.util.*;
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        Stack<ListNode> stack=new Stack<>();
        int count=1;
        ListNode first=null;
        while(pHead!=null){
            stack.push(pHead);
            if(pHead.next!=null){
                if(pHead.next.val==pHead.val)
                    count++;
                else{
                    if(count>1) {
                        for (int i = 0; i < count; i++)
                            stack.pop();
                        count = 1;
                    }
                }
            }
            else
                if(count>1) {
                        for (int i = 0; i < count; i++)
                            stack.pop();
                        count = 1;
                    }
            pHead=pHead.next;
        }
        while(!stack.isEmpty()){
            ListNode temp=stack.pop();
            temp.next=first;
            first=temp;
        }
        return first;
    }
}
