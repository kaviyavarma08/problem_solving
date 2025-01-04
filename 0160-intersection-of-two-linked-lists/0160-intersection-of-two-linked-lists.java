
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> s=new HashSet();
        ListNode th=headA;
        while(th!=null)
        {
            s.add(th);
            th=th.next;
        }
        while(headB!=null)
        {
            if(s.contains(headB))
            return headB;
            headB=headB.next;
        }
        return null;
    }
}