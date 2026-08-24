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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        {
            return head;
        }
        ListNode current=head;
        ListNode pre=null;
        while(current!=null)
        {
            if(current.val==val && current==head)
            {
                current=current.next;
                head=current;
                pre=null;
            }
            else if(current.val==val)
            {
                ListNode temp=current.next;
                pre.next=temp;
                current=temp;
            }
            else
            {
                ListNode temp=current;
                current=current.next;
                pre=temp;
            }
        }
        return head;
    }
}