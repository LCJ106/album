//输入两个链表，找出它们的第一个公共结点。
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1=pHead1,p2=pHead2;
        for(;p1!=null;p1=p1.next){
            for(;p2!=null;p2=p2.next){
                if(p2==p1)
                    return p1;
            }
            p2=pHead2;
        }
        return null;
        
              
 
    }
}
