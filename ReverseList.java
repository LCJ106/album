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
    public ListNode ReverseList(ListNode head) {
        ListNode first=null;
        while(head!=null){
            ListNode p=head;
            head=head.next;
            p.next=first;
            first=p;
        }
        return first;
       
   }      
              
}
