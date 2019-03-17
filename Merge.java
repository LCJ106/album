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
    public ListNode Merge(ListNode list1,ListNode list2) {
        Stack<ListNode> stack=new Stack<ListNode>();
        ListNode first=null,p=null;
        boolean flag1=false;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        while(true){
            if(list1.val>list2.val){
                stack.push(list2);
                list2=list2.next;
                if(list2==null){
                    break;
                }
            }
            else{
                stack.push(list1);
                list1=list1.next;
                if(list1==null){
                    flag1=true;
                    break;
                }
            }                                
        }
        if(flag1){
            while(list2!=null){
                stack.push(list2);
                list2=list2.next;
            }
        }
        else
        {
            while(list1!=null){
                stack.push(list1);
                list1=list1.next;
            }
        }
        while(!stack.isEmpty()){
            p=stack.pop();
            p.next=first;
            first=p;
        }
        return first;
            
        
    }
}
