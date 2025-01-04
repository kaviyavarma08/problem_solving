
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        if(head==null || head.next==null)
        return null;
        while(fast!=null&& fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(temp!=null && temp.next!=null)
        temp.next=temp.next.next;
        return head;

    }
}