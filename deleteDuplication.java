//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
import java.util.*;
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        Stack<Integer> stack=new Stack<>();
        ListNode first=null,p;
        while(pHead!=null){
            if(stack.search(pHead.val)==-1){
                stack.push(pHead.val);
                pHead=pHead.next;
            }
            else{
                while(stack.search(pHead.val)!=-1){
                    pHead=pHead.next;
                    if(pHead==null)
                        break;
                }
                stack.pop();
                if(pHead==null){
                    break;
                }
                else{
                    stack.push(pHead.val);
                    pHead=pHead.next;
                }
            }
        }
        while(!stack.isEmpty()){
            p=new ListNode(stack.pop());
            p.next=first;
            first=p;
        }
        return first;
    }
}

