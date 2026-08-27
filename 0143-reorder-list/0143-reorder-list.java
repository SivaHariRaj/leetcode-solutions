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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
         ListNode current=slow.next;
         slow.next=null;
         ListNode pre=null;
         while(current!=null)
         {
              ListNode temp=current.next;
              current.next=pre;
              pre=current;
              current=temp;
         }
          ListNode first=head;
          ListNode second=pre;
          while(second!=null)
          {
               ListNode f1=first.next;
               ListNode s1=second.next;
               first.next=second;
               second.next=f1;
               second=s1;
               first=f1;
          } 
    }
}