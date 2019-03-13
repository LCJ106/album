/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.*;
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> stack=new Stack<>();
        int count=0;
        ListNode node=null;
       if(head==null|k<=0)
           return null;       
        else{
            while(head!=null){
                stack.push(head);
                head=head.next;
                count++;
            }
            if(k>count)
                return null;
            for(int i=0;i<k;i++){
                node=stack.pop();
            }
            return node;
        }
        
    }
}
