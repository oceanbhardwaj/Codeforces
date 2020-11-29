class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1==null )
            return list2;
        if(list2==null)
            return list1;
        ListNode prev=null;
            ListNode next1=null;
        ListNode head1=list1;
        int count=0;
        while(list1!=null)
        {
            count++;
            list1=list1.next;
        }
        list1=head1;
        int l=a;
        int c=0;
        while(list1!=null)
        {
            c++;
            next1=list1.next;
             if(c==l)
                break;
            list1=list1.next;
            
           
        }
       // list1.next=list2;
        prev=head1;
        int diff=b-a+1;
        while(next1!=null && diff>0)
        {
            next1=next1.next;
            diff--;
        }
        ListNode d=list2;
        while(d.next!=null)
        {
            d=d.next;
        }
        d.next=next1;
        list1.next=list2;
        
        return head1;
        
        
        
        
    }
}