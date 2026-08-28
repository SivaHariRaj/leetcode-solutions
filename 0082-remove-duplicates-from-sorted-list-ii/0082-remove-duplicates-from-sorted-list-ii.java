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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next = head;
        ListNode current=head;
        ListNode prev=dummy;
        while(current!=null  && current.next!=null)
        {
            if(current.val==current.next.val)
            {
                ListNode iter=current.next.next;

                while(iter!=null && iter.val==current.val )
                {
                         iter=iter.next;

                }
                prev.next=iter;
                current=iter;
            }
            else
            {
                ListNode temp=current;
                current=current.next;
                prev=temp; 
            }
            
        }
        return dummy.next;
    }
}