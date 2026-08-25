public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(head!=null && head.next!=null)
        {
                 slow=slow.next;
                 head=head.next.next;
                 if(slow==head)
                 {
                    return true;
                 }
        }
        return false;    
    }
}