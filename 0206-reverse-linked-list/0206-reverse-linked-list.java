class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;  
        ListNode newhead=null;
        ListNode curr = head;    
        Stack<ListNode> s = new Stack<ListNode>();
        while(curr != null) { 
            s.push(curr);
            curr=curr.next;
        }
        if(s.isEmpty()) return null;
        newhead=s.pop();
        temp=newhead;

        while(!s.isEmpty()){
            temp.next = s.pop();
            temp = temp.next;
        }
        temp.next = null;

        return newhead;

    }
}
