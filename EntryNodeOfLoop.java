//给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
import java.util.*;
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
       Stack<ListNode> stack=new Stack<>();
       while(pHead!=null){
           stack.push(pHead);
           pHead=pHead.next;
           if(stack.search(pHead)!=-1)
               break;
       }
        return pHead;
    }
}
