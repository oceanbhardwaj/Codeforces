/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int count=1;
        ListNode ans=head;
        ListNode dummy=ans;
        ListNode next=null;
        if(head.next!=null)
        { head=head.next;}
        else
            return head;
        
         //next=head.next; }
        while(head!=null)
        {
            count++;
            int a=count;
            ListNode newList=new ListNode(1);
            ListNode dummyList=newList;
            int c=0;
            while(head!=null && a>0 )
            {
                dummyList.next=new ListNode(head.val);
                head=head.next;
                dummyList=dummyList.next;
                a--;
                c++;
            }
            if(c%2==0)
            {ListNode d=reverseList(newList.next);
             dummy.next=d;
            }
            else
            {
                dummy.next=newList.next;
            }
            while(dummy.next!=null)
            {
                dummy=dummy.next;
            }
            if(head==null)
                break;
            
        }
        return ans;
        
    }
    
    public ListNode reverseList(ListNode head)
    {
       
        ListNode prev=null;
        ListNode next=null;
        
        while(head!=null)
        {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        } 
        return prev;
        
        
        
        
        
    }
}