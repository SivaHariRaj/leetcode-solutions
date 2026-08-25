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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode current=head;
        while(current!=null)
        {
            current=current.next;
            len++;
        }
        if(n == len)
        {
            return head.next;
        }
        ListNode temp=head;
        int c=0;
        int find=len-n;
        while(c<find-1)
        {
          temp=temp.next;
          c++;
        }
        temp.next=temp.next.next;
        return head;
    }
}